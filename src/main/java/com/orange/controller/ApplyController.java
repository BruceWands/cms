package com.orange.controller;

import com.orange.model.Apply;
import com.orange.model.Recruit;
import com.orange.model.Resume;
import com.orange.model.User;
import com.orange.service.ApplyService;
import com.orange.service.RecruitService;
import com.orange.service.ResumeService;
import com.orange.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by 14037 on 2018/10/24.
 */
@Controller
public class ApplyController {
    @Resource
    private ApplyService applyService;
    @Resource
    private ResumeService resumeService;
    @Resource
    private RecruitService recruitService;

    //查看我的申请
    @RequestMapping("/showApplyView.do")
    public String showApplyView(HttpSession session, Model model) throws Exception{
        User user = (User) session.getAttribute("user");
        if(user == null){
            model.addAttribute("message","用户信息已失效，请重新登录！");
            return "login";
        }
        List<Apply> applyList = applyService.getApplyByUserId(user.getUser_id());
        if(applyList==null||applyList.isEmpty()){
            model.addAttribute("message","这里空空如也");
        }
        model.addAttribute("applyList",applyList);
        return "apply/userQueryApply";
    }
    //添加申请,如果同一份简历申请同一条招聘信息(即resume_id和recruit_id都相同)，视为重复，提示已申请过
    @RequestMapping("/addApply.do")
    public String addApply(Apply apply,Model model) throws Exception{
        if(applyService.getApplyByRepeat(apply)!=null){
            model.addAttribute("message","已申请过该岗位");
            return "homePage";
        }
        apply.setState(1);
        if(applyService.addApply(apply)){
            model.addAttribute("message","申请成功");
        }else {
            model.addAttribute("message","申请失败");
        }
        return "homePage";
    }
    //管理员（hr）查看用户的申请
    @RequestMapping("/adQueryApply.do")
    public String adQueryApply(HttpSession session) throws Exception{
        List<Apply> applyList = applyService.getAllApply();
        List<Recruit> recruitList = recruitService.getAllRecruit();
        List<Resume> resumeList = resumeService.getAllResume();
        session.setAttribute("applyList",applyList);
        session.setAttribute("recruitList",recruitList);
        session.setAttribute("resumeList",resumeList);
        return "apply/adQueryApply";
    }
}
