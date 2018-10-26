package com.orange.service.impl;

import com.orange.dao.ApplyDao;
import com.orange.model.Apply;
import com.orange.service.ApplyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 14037 on 2018/10/24.
 */
@Service
public class ApplyServiceImpl implements ApplyService{
    @Resource
    private ApplyDao applyDao;
    @Override
    public boolean addApply(Apply apply) {
        if(apply==null){
            return false;
        }
        applyDao.addApply(apply);
        return true;
    }

    @Override
    public boolean deleteApply(Apply apply) {
        if(apply==null){
            return false;
        }
        applyDao.deleteApply(apply);
        return true;
    }

    @Override
    public boolean updateApply(Apply apply) {
        if(apply==null){
            return false;
        }
        applyDao.updateApply(apply);
        return true;
    }

    @Override
    public Apply getApplyById(Apply apply) {
        if(apply==null){
            return null;
        }
        return applyDao.getApplyById(apply);
    }

    @Override
    public List<Apply> getAllApply() {
        return applyDao.getAllApply();
    }

    @Override
    public List<Apply> getApplyByWant() {
        return applyDao.getApplyByWant();
    }

    @Override
    public List<Apply> getApplyByUserId(Integer user_id) {
        if(user_id==null){
            return null;
        }
        return applyDao.getApplyByUserId(user_id);
    }

    @Override
    public Apply getApplyByRepeat(Apply apply) {
        if(apply==null){
            return null;
        }
        return applyDao.getApplyByRepeat(apply);
    }
}
