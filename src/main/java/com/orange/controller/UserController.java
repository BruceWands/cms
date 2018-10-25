package com.orange.controller;


import com.orange.model.Recruit;
import com.orange.model.User;
import com.orange.service.RecruitService;
import com.orange.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2018/10/5.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Resource
    private UserService userService;
    @Resource
    private RecruitService recruitService;

    //返回用户主页
    @RequestMapping(value = "/homeView.do")
    public String homeView() throws Exception{
        return "homePage";
    }
    //登录
    @RequestMapping(value = "/login.do")
    public String login(User user, HttpSession session, Model model) throws Exception{
        User user1 = userService.login(user);
        if(user1==null){
            model.addAttribute("message","登录失败，用户名或密码错误！");
            return "login";
        }else {
            session.setAttribute("user",user1);
            List<Recruit> recruitList = recruitService.getRecruitByPage(1);
            List<Recruit> recruitList2 = recruitService.getAllRecruit();
            if(recruitList2!=null&&!recruitList2.isEmpty()){
                int maxPage = recruitList2.size()/4+1;
                session.setAttribute("maxPage",maxPage);
            }
            session.setAttribute("recruitList",recruitList);
            return "homePage";
        }
    }
    //注册
    @RequestMapping(value = "/register.do")
    public String register(User user, HttpServletRequest request) throws Exception{
        if (!userService.saveUser(user)) {
            request.setAttribute("message", "注册失败");
            return "register";
        } else {
            request.setAttribute("message", "注册成功！");
            return "login";
        }
    }
    //检查注册时用户名是否重复
    @RequestMapping(value = "/checkRegister.do")
    public void checkRegister(User user, HttpServletResponse response) throws Exception{
        if(userService.getUserByName(user) != null){
            response.getWriter().print("123");
        }
    }

}
