package com.orange.service.impl;

import com.orange.dao.RecruitDao;
import com.orange.model.Recruit;
import com.orange.service.RecruitService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 14037 on 2018/10/21.
 */
@Service
public class RecruitServiceImpl implements RecruitService{
    @Resource
    private RecruitDao recruitDao;
    @Override
    public boolean addRecruit(Recruit recruit) {
        if(recruit == null){
            return false;
        }
        recruitDao.addRecruit(recruit);
        return true;
    }

    @Override
    public boolean deleteRecruit(Recruit recruit) {
        if(recruit == null){
            return false;
        }
        recruitDao.deleteRecruit(recruit);
        return true;
    }

    @Override
    public boolean updateRecruit(Recruit recruit) {
        if(recruit == null){
            return false;
        }
        recruitDao.deleteRecruit(recruit);
        return true;
    }

    @Override
    public Recruit getRecruitById(Integer id) {
        if(id == null){
            return null;
        }
        return recruitDao.getRecruitById(id);
    }

    @Override
    public List<Recruit> getAllRecruit() {
        return recruitDao.getAllRecruit();
    }

    @Override
    public List<Recruit> getRecruitByPage(Integer currentPage) {
        if(currentPage==null||currentPage<1){
            return null;
        }
        return recruitDao.getRecruitByPage(currentPage);
    }
}
