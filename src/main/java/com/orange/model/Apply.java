package com.orange.model;

import java.io.Serializable;

/**面试申请类
 * Created by 14037 on 2018/10/23.
 */
public class Apply implements Serializable{
    private Integer apply_id;
    private Integer recruit_id;//招聘信息id
    private Integer resume_id;//简历id
    private Integer state;//申请状态，1代表已申请，2代表企业已查看
    private Integer user_id;

    public Apply() {
    }

    public Integer getApply_id() {
        return apply_id;
    }

    public void setApply_id(Integer apply_id) {
        this.apply_id = apply_id;
    }

    public Integer getRecruit_id() {
        return recruit_id;
    }

    public void setRecruit_id(Integer recruit_id) {
        this.recruit_id = recruit_id;
    }

    public Integer getResume_id() {
        return resume_id;
    }

    public void setResume_id(Integer resume_id) {
        this.resume_id = resume_id;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
}
