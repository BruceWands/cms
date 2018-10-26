package com.orange.controller;

import com.orange.model.Dept;
import com.orange.service.DeptService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by 14037 on 2018/10/25.
 */
@Controller
public class DeptController {
    @Resource
    private DeptService deptService;

    //跳转到管理员查看部门页面
    @RequestMapping("/adQueryDept.do")
    public String adQueryDept(HttpSession session, Model model) throws Exception{
        List<Dept> deptList = deptService.getAllDept();
        session.setAttribute("deptList",deptList);
        if(deptList==null||deptList.isEmpty()){
            model.addAttribute("message","这里空空如也");
        }
        return "dept/adQueryDept";
    }
    //管理员删除部门
    @RequestMapping("/deleteDept.do")
    public String deleteDept(Dept dept,Model model) throws Exception{
        if(deptService.deleteDept(dept)){
            model.addAttribute("message","删除成功");
        }else {
            model.addAttribute("message","删除失败");
        }
        return "forward:adQueryDept.do";
    }
    //管理员修改部门名称
    @RequestMapping("/updateDpet.do")
    public String updateDept(Dept dept,Model model) throws Exception{
        if(deptService.getDeptByName(dept)!=null){
            model.addAttribute("message","该部门已存在");
            return "forward:adQueryDept.do";
        }
        if(deptService.updateDept(dept)){
            model.addAttribute("message","修改成功");
        }else {
            model.addAttribute("message","修改失败");
        }
        return "forward:adQueryDept.do";
    }
    //管理员创建部门
    @RequestMapping("/addDept.do")
    public String addDept(Dept dept,Model model) throws Exception{
        if(deptService.getDeptByName(dept)!=null){
            model.addAttribute("message","该部门已存在");
            return "forward:adQueryDept.do";
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm");
        String dept_create_time = sdf.format(new Date());
        dept.setDept_create_time(dept_create_time);
        if(deptService.addDept(dept)){
            model.addAttribute("message","创建成功");
        }else {
            model.addAttribute("message","创建失败");
        }
        return "forward:adQueryDept.do";
    }
}
