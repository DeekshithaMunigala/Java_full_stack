package com.wipro.employeemngnt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.employeemngnt.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
	List<Employee> findByFirstNameContainingIgnoreCase(String name);
}
