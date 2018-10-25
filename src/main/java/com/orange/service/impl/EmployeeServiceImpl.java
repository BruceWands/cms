package com.orange.service.impl;

import com.orange.dao.EmployeeDao;
import com.orange.model.Employee;
import com.orange.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 14037 on 2018/10/24.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Resource
    private EmployeeDao employeeDao;
    @Override
    public boolean addEmployee(Employee employee) {
        if(employee==null){
            return false;
        }
        employeeDao.addEmployee(employee);
        return true;
    }

    @Override
    public boolean deleteEmployee(Employee employee) {
        if(employee==null){
            return false;
        }
        employeeDao.deleteEmployee(employee);
        return true;
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        if(employee==null){
            return false;
        }
        employeeDao.updateEmployee(employee);
        return true;
    }

    @Override
    public Employee getEmployeeById(Employee employee) {
        if(employee==null){
            return null;
        }
        return employeeDao.getEmployeeById(employee);
    }

    @Override
    public Employee getEmpliyeeByIdAndPass(Employee employee) {
        if(employee==null){
            return null;
        }
        return employeeDao.getEmpliyeeByIdAndPass(employee);
    }

    @Override
    public List<Employee> getEmployeeByDeptId(Integer dept_id) {
        if(dept_id==null){
            return null;
        }
        return employeeDao.getEmployeeByDeptId(dept_id);
    }

    @Override
    public List<Employee> getEmployeeByPostId(Integer post_id) {
        if(post_id==null){
            return null;
        }
        return employeeDao.getEmployeeByPostId(post_id);
    }
}
