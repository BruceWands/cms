package com.orange.service.impl;

import com.orange.dao.DeptDao;
import com.orange.model.Dept;
import com.orange.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 14037 on 2018/10/25.
 */
@Service
public class DeptServiceImpl implements DeptService{
    @Resource
    private DeptDao deptDao;
    @Override
    public boolean addDept(Dept dept) {
        if(dept==null){
            return false;
        }
        deptDao.addDept(dept);
        return true;
    }

    @Override
    public boolean deleteDept(Dept dept) {
        if(dept==null){
            return false;
        }
        deptDao.deleteDept(dept);
        return true;
    }

    @Override
    public boolean updateDept(Dept dept) {
        if(dept==null){
            return false;
        }
        deptDao.updateDept(dept);
        return true;
    }

    @Override
    public Dept getDeptById(Dept dept) {
        if(dept==null){
            return null;
        }
        return deptDao.getDeptById(dept);
    }

    @Override
    public Dept getDeptByName(Dept dept) {
        if(dept==null){
            return null;
        }
        return deptDao.getDeptByName(dept);
    }

    @Override
    public List<Dept> getAllDept() {
        return deptDao.getAllDept();
    }
}
