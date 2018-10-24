package com.orange.model;

import java.io.Serializable;

/**
 * 个人简历类
 * Created by Administrator on 2018/10/20.
 */
public class Resume implements Serializable{
    private Integer resume_id;
    private String resume_name;//姓名
    private String resume_gender;//性别
    private String resume_birth;//出生年月
    private String resume_nation;//民族
    private String resume_politics_status;//政治面貌
    private String resume_stature;//身高
    private String resume_diploma;//学历
    private String resume_native_place;//籍贯
    private String resume_major;//专业
    private String resume_schoolTag;//毕业院校
    private String resume_language_skill;//英语水平
    private String resume_computer_rank;//计算机等级
    private String resume_work_experience;//工作经历
    private String resume_email;//邮箱
    private String resume_phone;//电话
    private String resume_self_appraisal;//自我评价
    private Integer user_id;//用户id

    public Resume() {
    }

    public Integer getResume_id() {
        return resume_id;
    }

    public void setResume_id(Integer resume_id) {
        this.resume_id = resume_id;
    }

    public String getResume_name() {
        return resume_name;
    }

    public void setResume_name(String resume_name) {
        this.resume_name = resume_name;
    }

    public String getResume_gender() {
        return resume_gender;
    }

    public void setResume_gender(String resume_gender) {
        this.resume_gender = resume_gender;
    }

    public String getResume_birth() {
        return resume_birth;
    }

    public void setResume_birth(String resume_birth) {
        this.resume_birth = resume_birth;
    }

    public String getResume_nation() {
        return resume_nation;
    }

    public void setResume_nation(String resume_nation) {
        this.resume_nation = resume_nation;
    }

    public String getResume_politics_status() {
        return resume_politics_status;
    }

    public void setResume_politics_status(String resume_politics_status) {
        this.resume_politics_status = resume_politics_status;
    }

    public String getResume_stature() {
        return resume_stature;
    }

    public void setResume_stature(String resume_stature) {
        this.resume_stature = resume_stature;
    }

    public String getResume_diploma() {
        return resume_diploma;
    }

    public void setResume_diploma(String resume_diploma) {
        this.resume_diploma = resume_diploma;
    }

    public String getResume_native_place() {
        return resume_native_place;
    }

    public void setResume_native_place(String resume_native_place) {
        this.resume_native_place = resume_native_place;
    }

    public String getResume_major() {
        return resume_major;
    }

    public void setResume_major(String resume_major) {
        this.resume_major = resume_major;
    }

    public String getResume_schoolTag() {
        return resume_schoolTag;
    }

    public void setResume_schoolTag(String resume_schoolTag) {
        this.resume_schoolTag = resume_schoolTag;
    }

    public String getResume_language_skill() {
        return resume_language_skill;
    }

    public void setResume_language_skill(String resume_language_skill) {
        this.resume_language_skill = resume_language_skill;
    }

    public String getResume_computer_rank() {
        return resume_computer_rank;
    }

    public void setResume_computer_rank(String resume_computer_rank) {
        this.resume_computer_rank = resume_computer_rank;
    }

    public String getResume_work_experience() {
        return resume_work_experience;
    }

    public void setResume_work_experience(String resume_work_experience) {
        this.resume_work_experience = resume_work_experience;
    }

    public String getResume_email() {
        return resume_email;
    }

    public void setResume_email(String resume_email) {
        this.resume_email = resume_email;
    }

    public String getResume_phone() {
        return resume_phone;
    }

    public void setResume_phone(String resume_phone) {
        this.resume_phone = resume_phone;
    }

    public String getResume_self_appraisal() {
        return resume_self_appraisal;
    }

    public void setResume_self_appraisal(String resume_self_appraisal) {
        this.resume_self_appraisal = resume_self_appraisal;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "resume_id=" + resume_id +
                ", resume_name='" + resume_name + '\'' +
                ", resume_gender='" + resume_gender + '\'' +
                ", resume_birth='" + resume_birth + '\'' +
                ", resume_nation='" + resume_nation + '\'' +
                ", resume_politics_status='" + resume_politics_status + '\'' +
                ", resume_stature='" + resume_stature + '\'' +
                ", resume_diploma='" + resume_diploma + '\'' +
                ", resume_native_place='" + resume_native_place + '\'' +
                ", resume_major='" + resume_major + '\'' +
                ", resume_schoolTag='" + resume_schoolTag + '\'' +
                ", resume_language_skill='" + resume_language_skill + '\'' +
                ", resume_computer_rank='" + resume_computer_rank + '\'' +
                ", resume_work_experience='" + resume_work_experience + '\'' +
                ", resume_email='" + resume_email + '\'' +
                ", resume_phone='" + resume_phone + '\'' +
                ", resume_self_appraisal='" + resume_self_appraisal + '\'' +
                '}';
    }
}
