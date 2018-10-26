package com.orange.model;

import java.io.Serializable;

/**
 * 面试邀请类
 * Created by 14037 on 2018/10/24.
 */
public class Invite implements Serializable{
    private Integer invite_id;
    private String invite_time;//邀请面试时间
    private Integer resume_id;//简历id
    private Integer recruit_id;//招聘id
    private Integer invite_state;//0代表用户未接受面试邀请，1代表已接受。

    public Invite() {
    }

    public Integer getInvite_id() {
        return invite_id;
    }

    public void setInvite_id(Integer invite_id) {
        this.invite_id = invite_id;
    }

    public String getInvite_time() {
        return invite_time;
    }

    public void setInvite_time(String invite_time) {
        this.invite_time = invite_time;
    }

    public Integer getResume_id() {
        return resume_id;
    }

    public void setResume_id(Integer resume_id) {
        this.resume_id = resume_id;
    }

    public Integer getRecruit_id() {
        return recruit_id;
    }
    public void setRecruit_id(Integer recruit_id) {
        this.recruit_id = recruit_id;
    }

    public Integer getInvite_state() {
        return invite_state;
    }

    public void setInvite_state(Integer invite_state) {
        this.invite_state = invite_state;
    }
}
