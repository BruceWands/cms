package com.orange.model;

import java.io.Serializable;

/**
 * 员工类
 * Created by 14037 on 2018/10/24.
 */
public class Employee implements Serializable{
    private Integer emp_id;//员工id
    private String emp_name;//员工姓名
    private String emp_pass;//员工密码
    private String emp_gender;//员工性别
    private String emp_birth;//员工出生日期
    private String emp_nation;//员工所属民族
    private String emp_politics_status;//员工政治面貌
    private String emp_diploma;//员工学历
    private String emp_native_place;//员工籍贯
    private String emp_email;//员工邮箱
    private String emp_phone;//员工电话
    private String emp_major;//员工专业
    private Integer dept_id;//员工所属部门id
    private Integer post_id;//员工所属岗位id
    private Integer salary_id;//员工薪资id
    private Integer emp_state;//员工状态：1表示在职试用期，2表示在职正式员工，3表示离职员工

    public Employee() {
    }

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_pass() {
        return emp_pass;
    }

    public void setEmp_pass(String emp_pass) {
        this.emp_pass = emp_pass;
    }

    public String getEmp_gender() {
        return emp_gender;
    }

    public void setEmp_gender(String emp_gender) {
        this.emp_gender = emp_gender;
    }

    public String getEmp_birth() {
        return emp_birth;
    }

    public void setEmp_birth(String emp_birth) {
        this.emp_birth = emp_birth;
    }

    public String getEmp_nation() {
        return emp_nation;
    }

    public void setEmp_nation(String emp_nation) {
        this.emp_nation = emp_nation;
    }

    public String getEmp_politics_status() {
        return emp_politics_status;
    }

    public void setEmp_politics_status(String emp_politics_status) {
        this.emp_politics_status = emp_politics_status;
    }

    public String getEmp_diploma() {
        return emp_diploma;
    }

    public void setEmp_diploma(String emp_diploma) {
        this.emp_diploma = emp_diploma;
    }

    public String getEmp_native_place() {
        return emp_native_place;
    }

    public void setEmp_native_place(String emp_native_place) {
        this.emp_native_place = emp_native_place;
    }

    public String getEmp_email() {
        return emp_email;
    }

    public void setEmp_email(String emp_email) {
        this.emp_email = emp_email;
    }

    public String getEmp_phone() {
        return emp_phone;
    }

    public void setEmp_phone(String emp_phone) {
        this.emp_phone = emp_phone;
    }

    public String getEmp_major() {
        return emp_major;
    }

    public void setEmp_major(String emp_major) {
        this.emp_major = emp_major;
    }

    public Integer getDept_id() {
        return dept_id;
    }

    public void setDept_id(Integer dept_id) {
        this.dept_id = dept_id;
    }

    public Integer getPost_id() {
        return post_id;
    }

    public void setPost_id(Integer post_id) {
        this.post_id = post_id;
    }

    public Integer getSalary_id() {
        return salary_id;
    }

    public void setSalary_id(Integer salary_id) {
        this.salary_id = salary_id;
    }

    public Integer getEmp_state() {
        return emp_state;
    }

    public void setEmp_state(Integer emp_state) {
        this.emp_state = emp_state;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                ", emp_pass='" + emp_pass + '\'' +
                ", emp_gender='" + emp_gender + '\'' +
                ", emp_birth='" + emp_birth + '\'' +
                ", emp_nation='" + emp_nation + '\'' +
                ", emp_politics_status='" + emp_politics_status + '\'' +
                ", emp_diploma='" + emp_diploma + '\'' +
                ", emp_native_place='" + emp_native_place + '\'' +
                ", emp_email='" + emp_email + '\'' +
                ", emp_phone='" + emp_phone + '\'' +
                ", emp_major='" + emp_major + '\'' +
                ", dept_id=" + dept_id +
                ", post_id=" + post_id +
                ", salary_id=" + salary_id +
                '}';
    }
}
