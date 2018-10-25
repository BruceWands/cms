package com.orange.controller;

import com.orange.model.Invite;
import com.orange.service.InviteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by 14037 on 2018/10/25.
 */
@Controller
public class InviteController {
    @Resource
    private InviteService inviteService;

    //发送（添加）面试邀请
    @RequestMapping("/addInvite.do")
    public String addInvite(Invite invite, Model model) throws Exception{

        if(inviteService.addInvite(invite)){
            model.addAttribute("message","发送成功");
        }else {
            model.addAttribute("message","发送失败");
        }
        return "";
    }
}
