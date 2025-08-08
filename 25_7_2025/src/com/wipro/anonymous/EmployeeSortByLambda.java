package com.wipro.anonymous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSortByLambda {
	public static void main(String[] args) {
		Employee emp1 = new Employee("EMP1", "Amit", 21, 70000);
		Employee emp2 = new Employee("EMP2", "Rahul", 22, 50000);
		Employee emp3 = new Employee("EMP4", "Jack", 25, 90000);
		Employee emp4 = new Employee("EMP3", "John", 23, 80000);
		
		List<Employee> employeeList= new ArrayList<>();
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		
//		Sorting based on the age
		Comparator<Employee> sortByAge = (e1, e2) -> {
			Integer i1 = Integer.valueOf(e1.getEmpAge());
			Integer i2 = Integer.valueOf(e2.getEmpAge());
			return i1.compareTo(i2);
		};
		Collections.sort(employeeList, sortByAge);
		System.out.println(employeeList);
		
//		Sorting based on the Id
		Comparator<Employee> sortById = (e1, e2) -> {
			return e1.getEmpId().compareTo(e2.getEmpId());
		};
		
		Collections.sort(employeeList, sortById);
		System.out.println(employeeList);
		
		
//		Sorting based on the Name
		Comparator<Employee> sortByName = (e1, e2) -> {
			return e1.getEmpName().compareTo(e2.getEmpName());
		};
		Collections.sort(employeeList, sortByName);
		System.out.println(employeeList);
		
		
//		Sorting based on the salary
		Comparator<Employee> sortBySalary = (e1, e2) -> {
			Double d1 = Double.valueOf(e1.getEmpSalary());
			Double d2 = Double.valueOf(e2.getEmpSalary());
			return d1.compareTo(d2);
		};
		Collections.sort(employeeList, sortBySalary);
		System.out.println(employeeList);
	}

}
