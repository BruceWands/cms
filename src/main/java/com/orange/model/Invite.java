package com.orange.model;

import java.io.Serializable;

/**
 * 面试邀请类
 * Created by 14037 on 2018/10/24.
 */
public class Invite implements Serializable{
    private Integer invite_id;
    private String invite_time;//邀请面试时间
    private Integer user_id;//被邀请人id;

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

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

}
