package com.orange.service;

import com.orange.model.Dept;

import java.util.List;

/**
 * Created by 14037 on 2018/10/25.
 */
public interface DeptService {
    boolean addDept(Dept dept);
    boolean deleteDept(Dept dept);
    boolean updateDept(Dept dept);
    Dept getDeptById(Dept dept);
    Dept getDeptByName(Dept dept);
    List<Dept> getAllDept();
}
