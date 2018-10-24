package com.orange.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/10/20.
 */
public class Recruit implements Serializable{
    private Integer recruit_id;
    private String recruit_company_name;//公司名称
    private String recruit_company_post;//招聘岗位
    private String recruit_region;//地区
    private String recruit_salary;//薪水
    private String recruit_demand;//任职要求
    private String recruit_post_info;//职位信息
    private String recruit_contact;//联系方式及地址

    public Recruit() {
    }

    public Integer getRecruit_id() {
        return recruit_id;
    }

    public void setRecruit_id(Integer recruit_id) {
        this.recruit_id = recruit_id;
    }

    public String getRecruit_company_name() {
        return recruit_company_name;
    }

    public void setRecruit_company_name(String recruit_company_name) {
        this.recruit_company_name = recruit_company_name;
    }

    public String getRecruit_company_post() {
        return recruit_company_post;
    }

    public void setRecruit_company_post(String recruit_company_post) {
        this.recruit_company_post = recruit_company_post;
    }

    public String getRecruit_region() {
        return recruit_region;
    }

    public void setRecruit_region(String recruit_region) {
        this.recruit_region = recruit_region;
    }

    public String getRecruit_salary() {
        return recruit_salary;
    }

    public void setRecruit_salary(String recruit_salary) {
        this.recruit_salary = recruit_salary;
    }

    public String getRecruit_demand() {
        return recruit_demand;
    }

    public void setRecruit_demand(String recruit_demand) {
        this.recruit_demand = recruit_demand;
    }

    public String getRecruit_post_info() {
        return recruit_post_info;
    }

    public void setRecruit_post_info(String recruit_post_info) {
        this.recruit_post_info = recruit_post_info;
    }

    public String getRecruit_contact() {
        return recruit_contact;
    }

    public void setRecruit_contact(String recruit_contact) {
        this.recruit_contact = recruit_contact;
    }

    @Override
    public String toString() {
        return "Recruit{" +
                "recruit_id=" + recruit_id +
                ", recruit_company_name='" + recruit_company_name + '\'' +
                ", recruit_company_post='" + recruit_company_post + '\'' +
                ", recruit_region='" + recruit_region + '\'' +
                ", recruit_salary='" + recruit_salary + '\'' +
                ", recruit_demand='" + recruit_demand + '\'' +
                ", recruit_post_info='" + recruit_post_info + '\'' +
                ", recruit_contact='" + recruit_contact + '\'' +
                '}';
    }
}
