package com.orange.service;

import com.orange.model.Apply;

import java.util.List;

/**
 * Created by 14037 on 2018/10/24.
 */
public interface ApplyService {
    boolean addApply(Apply apply);
    boolean deleteApply(Apply apply);
    boolean updateApply(Apply apply);
    Apply getApplyById(Apply apply);
    List<Apply> getAllApply();
    List<Apply> getApplyByWant();
    List<Apply> getApplyByUserId(Integer user_id);
    Apply getApplyByRepeat(Apply apply);
}
