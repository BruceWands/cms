package com.orange.controller;

import com.orange.model.Resume;
import com.orange.model.User;
import com.orange.service.ResumeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by 14037 on 2018/10/22.
 */
@Controller
public class ResumeController {
    @Resource
    private ResumeService resumeService;

    //查看个人简历
    @RequestMapping("/showResume.do")
    public String showResume(HttpSession session, Model model) throws Exception{
        User user = (User) session.getAttribute("user");
        if(user == null){
            model.addAttribute("message","用户信息已失效，请重新登录！");
            return "login";
        }
        List<Resume> resumeList = resumeService.getResumeByUserId(user.getUser_id());
        if(resumeList==null||resumeList.isEmpty()){
            model.addAttribute("message","这里空空如也");
        }
        session.setAttribute("resumeList",resumeList);
        return "resumeCenter";
    }
    //删除简历
    @RequestMapping("/deleteResume.do")
    public String deleteResume(Resume resume,HttpSession session,Model model) throws Exception{
        if(resumeService.deleteResume(resume)){
            model.addAttribute("message","删除成功");
        }else {
            model.addAttribute("message","删除失败");
        }
        return "redirect:showResume.do";
    }
    //跳转到修改简历页面
    @RequestMapping("/updateResumeView.do")
    public String updateResumeView(Integer resume_id,HttpSession session) throws Exception{
        Resume resume = resumeService.getResumeById(resume_id);
        session.setAttribute("resume",resume);
        return "updateResume";
    }
    //修改简历操作
    @RequestMapping("/updateResume.do")
    public String updateResume(Resume resume,Model model) throws Exception{
        if(resumeService.updateResume(resume)){
            model.addAttribute("message","修改成功");
        }else {
            model.addAttribute("message","修改失败");
        }
        return "resumeCenter";
    }
    //跳转到创建简历页面
    @RequestMapping("/addResumeView.do")
    public String addResumeView() throws Exception{
        return "addResume";
    }
    //创建简历
    @RequestMapping("/addResume.do")
    public String addResume(Resume resume,HttpSession session,Model model) throws Exception{
        User user = (User) session.getAttribute("user");
        if(user == null){
            model.addAttribute("message","用户信息已失效，请重新登录！");
            return "login";
        }
        if(resumeService.addResume(resume)){
            model.addAttribute("message","创建成功");
        }else {
            model.addAttribute("message","创建失败");
        }
        return "redirect:showResume.do";
    }
    /*//职位申请前选择简历
    @RequestMapping("choiceResume.do")
    public String */
}
