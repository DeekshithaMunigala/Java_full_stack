package com.wipro.employeemngnt.service;

import java.util.List;
import java.util.Optional;

import com.wipro.employeemngnt.model.Department;
import com.wipro.employeemngnt.model.Employee;

public interface EmployeeService {
	
	Employee createEmployee(Employee employee);
    Optional<Employee> getEmployeeById(Long id);
    Employee updateEmployee(Long id, Employee employee);
    boolean deleteEmployee(Long id);
    List<Employee> getAllEmployees();
    List<Employee> getEmployeeByName(String firstName);
    List<Department> getAllDepartments();

}
