package com.orange.dao;

import com.orange.model.Recruit;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * dao
 * Created by 14037 on 2018/10/21.
 */
public interface RecruitDao {
    void addRecruit(Recruit recruit);
    void deleteRecruit(Recruit recruit);
    void updateRecruit(Recruit recruit);
    Recruit getRecruitById(Integer id);
    List<Recruit> getAllRecruit();
    List<Recruit> getRecruitByPage(@Param("currentPage") Integer currentPage);
}
