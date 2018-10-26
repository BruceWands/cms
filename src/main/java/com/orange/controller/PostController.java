package com.orange.controller;

import com.orange.model.Dept;
import com.orange.model.Post;
import com.orange.service.DeptService;
import com.orange.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by 14037 on 2018/10/26.
 */
@Controller
public class PostController {
    @Resource
    private PostService postService;
    @Resource
    private DeptService deptService;

    //跳转到管理员查看职位页面
    @RequestMapping("/adQueryPost.do")
    public String adQueryPost(HttpSession session, Model model) throws Exception{
        List<Dept> deptList = deptService.getAllDept();
        session.setAttribute("deptList",deptList);
        List<Post> postList = postService.getAllPost();
        session.setAttribute("postList",postList);
        if(deptList==null||deptList.isEmpty()||postList==null||postList.isEmpty()){
            model.addAttribute("message","这里空空如也");
        }
        return "post/adQueryPost";
    }
    //管理员创建职位
    @RequestMapping("/addPost.do")
    public String addPost(Post post,Model model) throws Exception{
        if(postService.getPostByName(post)!=null){
            model.addAttribute("message","该职位已存在");
            return "forward:adQueryPost.do";
        }
        if(postService.addPost(post)){
            model.addAttribute("message","创建成功");
        }else {
            model.addAttribute("message","创建失败");
        }
        return "forward:adQueryPost.do";
    }
    //管理员删除职位
    @RequestMapping("/deletePost.do")
    public String deletePost(Post post,Model model) throws Exception{
        if(postService.deletePost(post)){
            model.addAttribute("message","删除成功");
        }else {
            model.addAttribute("message","删除失败");
        }
        return "forward:adQueryPost.do";
    }
    //管理员修改职位名称
    @RequestMapping("/updatePost.do")
    public String updatePost(Post post,Model model) throws Exception{
        if(postService.getPostByName(post)!=null){
            model.addAttribute("message","该职位已存在");
            return "forward:adQueryPost.do";
        }
        if(postService.updatePost(post)){
            model.addAttribute("message","修改成功");
        }else {
            model.addAttribute("message","修改失败");
        }
        return "forward:adQueryPost.do";
    }
}
