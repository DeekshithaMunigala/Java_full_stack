package com.wipro.relationdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.relationdemo.entity.Employee;
import com.wipro.relationdemo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping
	void save(@RequestBody Employee employee){
		System.out.println(employee);
		employeeService.save(employee);
	}
	
	@GetMapping
	List<Employee> findAll() {
		return employeeService.findAll();
	}
}
