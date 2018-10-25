package com.orange.controller;

import com.orange.model.Employee;
import com.orange.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by 14037 on 2018/10/24.
 */
@Controller
public class EmpController {
    @Resource
    private EmployeeService employeeService;

    //跳转到管理员主页
    @RequestMapping(value = "/administratorView.do")
    public String administratorView() throws Exception{
        return "administrator";
    }
    //员工或管理员登录
    @RequestMapping("/eLogin.do")
    public String eLogin(Employee employee, Model model) throws Exception{
        Employee employee1 = employeeService.getEmpliyeeByIdAndPass(employee);
        if(employee1==null){
            model.addAttribute("message","登录失败，员工号或密码错误!");
            return "eLogin";
        }
        if(employee1.getEmp_id()==1){
            return "administrator";
        }else {
            return "employee";
        }
    }
}
