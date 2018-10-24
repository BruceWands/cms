package com.orange.service;

import com.orange.model.Recruit;

import java.util.List;

/**
 * Created by 14037 on 2018/10/21.
 */
public interface RecruitService {
    boolean addRecruit(Recruit recruit);
    boolean deleteRecruit(Recruit recruit);
    boolean updateRecruit(Recruit recruit);
    Recruit getRecruitById(Integer id);
    List<Recruit> getAllRecruit();
    List<Recruit> getRecruitByPage(Integer currentPage);

}
