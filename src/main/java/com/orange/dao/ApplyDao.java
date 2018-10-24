package com.orange.dao;

import com.orange.model.Apply;

import java.util.List;

/**
 * Created by 14037 on 2018/10/24.
 */
public interface ApplyDao {
    void addApply(Apply apply);
    void deleteApply(Apply apply);
    void updateApply(Apply apply);
    Apply getApplyById(Apply apply);
    List<Apply> getAllApply();
    List<Apply> getApplyByUserId(Integer user_id);
}
