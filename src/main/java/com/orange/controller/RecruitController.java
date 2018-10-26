package com.orange.controller;

import com.orange.model.Recruit;
import com.orange.service.RecruitService;
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
public class RecruitController {
    @Resource
    private RecruitService recruitService;

    //分页查看招聘信息
    @RequestMapping("/showRecruit.do")
    public String showRecruit(Integer currentPage,HttpSession session) throws Exception{
        List<Recruit> recruitList = recruitService.getRecruitByPage(currentPage);
        List<Recruit> recruitList2 = recruitService.getAllRecruit();
        if(recruitList2!=null&&!recruitList2.isEmpty()){
            int maxPage = recruitList2.size()/4+1;
            session.setAttribute("maxPage",maxPage);
        }
        session.setAttribute("recruitList",recruitList);
        return "homePage";
    }
    //跳转到添加招聘信息页面
    @RequestMapping("/addRecruitView.do")
    public String addRecruitView() throws Exception{
        return "recruit/addRecruit";
    }
    //跳转到管理员查看招聘信息页面
    @RequestMapping("/recruitView.do")
    public String recruitView(Integer currentPage,HttpSession session) throws Exception{
        List<Recruit> recruitList = recruitService.getRecruitByPage(currentPage);
        List<Recruit> recruitList2 = recruitService.getAllRecruit();
        if(recruitList2!=null&&!recruitList2.isEmpty()){
            int maxPage = recruitList2.size()/4+1;
            session.setAttribute("maxPage",maxPage);
        }
        session.setAttribute("recruitList",recruitList);
        return "recruit/adQueryRecruit";
    }
    //添加招聘信息
    @RequestMapping("/addRecruit.do")
    public String addRecruit(Recruit recruit, Model model) throws Exception{
        if(recruitService.addRecruit(recruit)){
            model.addAttribute("message","添加成功");
        }else {
            model.addAttribute("message","添加失败");
        }
        return "administrator";
    }
    //跳转到修改招聘信息页面
    @RequestMapping("/updateRecruitView.do")
    public String updateRecruitView(Integer recruit_id, Model model) throws Exception{
        Recruit recruit = recruitService.getRecruitById(recruit_id);
        model.addAttribute("recruit",recruit);
        return "recruit/updateRecruit";
    }
    //管理员修改招聘信息
    @RequestMapping("/updateRecruit.do")
    public String updateRecruit(Recruit recruit, Model model) throws Exception{
        if(recruitService.updateRecruit(recruit)){
            model.addAttribute("message","修改成功");
        }else {
            model.addAttribute("message","修改失败");
        }
        return "administrator";
    }
    //删除招聘信息
    @RequestMapping("/deleteRecruit.do")
    public String deleteRecruit(Recruit recruit, Model model,HttpSession session) throws Exception{
        if(recruitService.deleteRecruit(recruit)){
            model.addAttribute("message","删除成功");
        }else {
            model.addAttribute("message","删除失败");
        }
        return "administrator";
    }
}
