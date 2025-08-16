package com.wipro.employeemngnt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wipro.employeemngnt.model.Department;
import com.wipro.employeemngnt.model.Employee;
import com.wipro.employeemngnt.repo.DepartmentRepo;
import com.wipro.employeemngnt.service.EmployeeService;

import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;

@Controller
@RequiredArgsConstructor
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	DepartmentRepo departmentRepo;
	
	 	@GetMapping
	    public String listEmployees(Model model) {
	        List<Employee> employees = employeeService.getAllEmployees();
	        model.addAttribute("employees", employees);
	        return "employee_list";
	    }

	    // Show form for new employee
	 	@GetMapping("/new")
	    public String showForm(@RequestParam(required = false) Long id, Model model) {
	        Employee employee = (id != null) ? employeeService.getEmployeeById(id).orElse(new Employee()) : new Employee();
	        model.addAttribute("employee", employee);

	        // Get all departments for the form
	        model.addAttribute("departments", departmentRepo.findAll());

	        return "employee_form";
	    }


	    // Create Employee
	    @PostMapping
	    public String createEmployee(@ModelAttribute Employee employee) {
	        employeeService.createEmployee(employee);
	        return "redirect:/employees"; // Redirect to list page after save
	    }


	    // Get Employee by ID
	    @GetMapping("/searchById")
	    public String searchByIdParam(@RequestParam Long id, Model model) {
	        Employee emp = employeeService.getEmployeeById(id).orElse(null);
	        if (emp != null) {
	            model.addAttribute("employees", List.of(emp));
	        } else {
	            model.addAttribute("employees", List.of());
	            model.addAttribute("error", "Employee not found with ID: " + id);
	        }
	        return "employee_list";
	    }




	    // Update Employee
	    @PostMapping("/edit/{id}")
	    public String updateEmployee(@PathVariable Long id, @ModelAttribute Employee employee) {
	        employeeService.updateEmployee(id, employee);
	        return "redirect:/employees";
	    }

	    // Delete Employee
	    @GetMapping("/delete/{id}")
	    public String deleteEmployee(@PathVariable Long id) {
	        employeeService.deleteEmployee(id);
	        return "redirect:/employees";
	    }


	    // Search by name
	    @GetMapping("/search")
	    public String searchByName(@RequestParam String firstName, Model model) {
	        List<Employee> list = employeeService.getEmployeeByName(firstName);
	        model.addAttribute("employees", list);
	        return "employee_list";
	    }

}
