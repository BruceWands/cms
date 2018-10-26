package com.orange.dao;

import com.orange.model.Dept;

import java.util.List;

/**
 * Created by 14037 on 2018/10/25.
 */
public interface DeptDao {
    void addDept(Dept dept);
    void deleteDept(Dept dept);
    void updateDept(Dept dept);
    Dept getDeptById(Dept dept);
    Dept getDeptByName(Dept dept);
    List<Dept> getAllDept();
}
