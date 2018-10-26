package com.orange.model;

import java.io.Serializable;

/**
 * 职位类
 * Created by 14037 on 2018/10/25.
 */
public class Post implements Serializable{
    private Integer post_id;
    private String post_name;//职位名称
    private Integer dept_id;//部门id

    public Post() {
    }

    public Integer getPost_id() {
        return post_id;
    }

    public void setPost_id(Integer post_id) {
        this.post_id = post_id;
    }

    public String getPost_name() {
        return post_name;
    }

    public void setPost_name(String post_name) {
        this.post_name = post_name;
    }

    public Integer getDept_id() {
        return dept_id;
    }

    public void setDept_id(Integer dept_id) {
        this.dept_id = dept_id;
    }
}
