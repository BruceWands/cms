package com.orange.controller;

import com.orange.model.Invite;
import com.orange.model.Recruit;
import com.orange.model.Resume;
import com.orange.service.InviteService;
import com.orange.service.RecruitService;
import com.orange.service.ResumeService;
import com.orange.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 14037 on 2018/10/25.
 */
@Controller
public class InviteController {
    @Resource
    private InviteService inviteService;
    @Resource
    private RecruitService recruitService;
    @Resource
    private ResumeService resumeService;

    //发送（添加）面试邀请，通过简历id查询是否已发送过面试
    @RequestMapping("/addInvite.do")
    public String addInvite(Invite invite, Model model) throws Exception{
        Invite invite1 = inviteService.getInviteByResumeId(invite.getResume_id());
        if(invite1!=null){
            model.addAttribute("message","不可重复发送面试邀请");
            return "apply/adQueryApply";
        }
        invite.setInvite_state(0);
        if(inviteService.addInvite(invite)){
            model.addAttribute("message","邀请成功");
        }else {
            model.addAttribute("message","邀请失败");
        }
        return "apply/adQueryApply";
    }
    //用户查看面试邀请
    @RequestMapping("/userQueryInvite.do")
    public String userQueryInvite(Integer user_id, HttpSession session) throws Exception{
        List<Resume> resumeList = resumeService.getResumeByUserId(user_id);
        List<Invite> invites =inviteService.getAllInvite();
        List<Invite> inviteList = new ArrayList<>();
        for(Resume resume : resumeList){
            for(Invite invite : invites){
                if(invite.getResume_id()==resume.getResume_id()){
                    inviteList.add(invite);
                }
            }
        }
        session.setAttribute("inviteList",inviteList);
        List<Recruit> recruitList = recruitService.getAllRecruit();
        session.setAttribute("recruitList1",recruitList);
        return "invite/userQueryInvite";
    }
    //管理员查看面试邀请，决定是否录用
    @RequestMapping("/adQueryInvite.do")
    public String adQueryInvite(HttpSession session,Model model) throws Exception{
        List<Invite> inviteList = inviteService.getInviteOnlyAccept();
        if(inviteList==null||inviteList.isEmpty()){
            model.addAttribute("message","这里空空如也");
            return "invite/adQueryInvite";
        }
        session.setAttribute("inviteList",inviteList);
        List<Resume> resumeList = resumeService.getAllResume();
        session.setAttribute("resumeList",resumeList);
        List<Recruit> recruitList = recruitService.getAllRecruit();
        session.setAttribute("recruitList",recruitList);
        return "invite/adQueryInvite";
    }
    //用户接受面试邀请
    @RequestMapping("/acceptInvite.do")
    public String acceptInvite(Invite invite,Model model) throws Exception{
        Invite invite1 = inviteService.getInviteById(invite);
        if(invite1.getInvite_state()==1){
            model.addAttribute("message","不可重复接受");
            return "invite/userQueryInvite";
        }else {
            invite1.setInvite_state(1);
            inviteService.updateInvite(invite1);
            model.addAttribute("message","成功接受");
        }
        return "invite/userQueryInvite";
    }
}
