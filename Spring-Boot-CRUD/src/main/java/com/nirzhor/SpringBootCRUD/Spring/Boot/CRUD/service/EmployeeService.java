package com.nirzhor.SpringBootCRUD.Spring.Boot.CRUD.service;

import com.nirzhor.SpringBootCRUD.Spring.Boot.CRUD.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);

}
