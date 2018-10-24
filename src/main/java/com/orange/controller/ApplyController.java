package com.orange.controller;

import com.orange.model.Apply;
import com.orange.model.User;
import com.orange.service.ApplyService;
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
    @RequestMapping("/addApply.do")
    public String addApply(Integer recruit_id,Integer user_id) throws Exception{
        return "";
    }
}
