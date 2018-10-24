package com.orange.model;

import java.io.Serializable;

/**
 * Created by 14037 on 2018/10/24.
 */
public class Invite implements Serializable{
    private Integer invite_id;
    private String invite_content;//邀请面试内容
    private Integer user_id;//被邀请人id;

    public Invite() {
    }

    public Integer getInvite_id() {
        return invite_id;
    }

    public void setInvite_id(Integer invite_id) {
        this.invite_id = invite_id;
    }

    public String getInvite_content() {
        return invite_content;
    }

    public void setInvite_content(String invite_content) {
        this.invite_content = invite_content;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "Invite{" +
                "invite_id=" + invite_id +
                ", invite_content='" + invite_content + '\'' +
                ", user_id=" + user_id +
                '}';
    }
}
