package com.orange.controller;

import com.orange.model.Recruit;
import com.orange.service.RecruitService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by 14037 on 2018/10/22.
 */
@Controller
@RequestMapping("/recruit")
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
}
