package com.orange.dao;

import com.orange.model.Employee;

import java.util.List;

/**
 * Created by 14037 on 2018/10/24.
 */
public interface EmployeeDao {
    void addEmployee(Employee employee);
    void deleteEmployee(Employee employee);
    void updateEmployee(Employee employee);
    Employee getEmployeeById(Employee employee);
    Employee getEmpliyeeByIdAndPass(Employee employee);
    List<Employee> getEmployeeByDeptId(Integer dept_id);
    List<Employee> getEmployeeByPostId(Integer post_id);
}
