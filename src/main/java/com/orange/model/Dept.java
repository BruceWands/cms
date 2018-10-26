package com.orange.model;

import java.io.Serializable;

/**
 * 部门类
 * Created by 14037 on 2018/10/25.
 */
public class Dept implements Serializable{
    private Integer dept_id;
    private String dept_name;//部门名称
    private String dept_create_time;//部门创立时间

    public Dept() {
    }

    public Integer getDept_id() {
        return dept_id;
    }

    public void setDept_id(Integer dept_id) {
        this.dept_id = dept_id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getDept_create_time() {
        return dept_create_time;
    }

    public void setDept_create_time(String dept_create_time) {
        this.dept_create_time = dept_create_time;
    }
}
