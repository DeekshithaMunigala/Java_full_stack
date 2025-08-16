package com.wipro.employeemngnt.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.employeemngnt.model.Department;
import com.wipro.employeemngnt.model.Employee;
import com.wipro.employeemngnt.repo.DepartmentRepo;
import com.wipro.employeemngnt.repo.EmployeeRepo;
import com.wipro.employeemngnt.service.EmployeeService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	@Autowired
	DepartmentRepo departmentRepo;
	
	@Override
	public Employee createEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

	@Override
	public Optional<Employee> getEmployeeById(Long id) {
		return employeeRepo.findById(id);
	}

	@Override
	public Employee updateEmployee(Long id, Employee employee) {
		return employeeRepo.findById(id).map(existing -> {
            existing.setFirstName(employee.getFirstName());
            existing.setLastName(employee.getLastName());
            existing.setEmail(employee.getEmail());
            existing.setEmployeeType(employee.getEmployeeType());
            existing.setDepartment(employee.getDepartment());
            existing.setAddress(employee.getAddress());
            return employeeRepo.save(existing);
        }).orElse(null);
	}

	@Override
	public boolean deleteEmployee(Long id) {
		return employeeRepo.findById(id).map(emp -> {
            employeeRepo.delete(emp);
            return true;
        }).orElse(false);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepo.findAll();
	}

	@Override
	public List<Employee> getEmployeeByName(String firstName) {
		return employeeRepo.findByFirstNameContainingIgnoreCase(firstName);
	}

	@Override
	public List<Department> getAllDepartments() {
		// TODO Auto-generated method stub
		return null;
	}

}
