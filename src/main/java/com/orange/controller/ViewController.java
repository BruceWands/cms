package com.orange.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/10/5.
 */
@Controller
public class ViewController {
    //跳转到初始页
    @RequestMapping("/index.do")
    public String index() throws Exception{
        return "index";
    }
    //跳转到游客登录页
    @RequestMapping("/login.do")
    public String login() throws Exception{
        return "login";
    }
    //跳转到游客注册页
    @RequestMapping("/register.do")
    public String register() throws Exception{
        return "register";
    }
    //跳转到员工登录页
    @RequestMapping("/eLoginView.do")
    public String eLoginView() throws Exception{
        return "eLogin";
    }
}
