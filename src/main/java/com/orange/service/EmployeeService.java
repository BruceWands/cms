package com.orange.service;

import com.orange.model.Employee;

import java.util.List;

/**
 * Created by 14037 on 2018/10/24.
 */
public interface EmployeeService {
    boolean addEmployee(Employee employee);
    boolean deleteEmployee(Employee employee);
    boolean updateEmployee(Employee employee);
    Employee getEmployeeById(Employee employee);
    Employee getEmpliyeeByIdAndPass(Employee employee);
    List<Employee> getEmployeeByDeptId(Integer dept_id);
    List<Employee> getEmployeeByPostId(Integer post_id);
}
