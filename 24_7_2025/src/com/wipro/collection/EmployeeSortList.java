package com.wipro.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee("EMP1", "Amit", 21, 70000);
		Employee emp2 = new Employee("EMP2", "Rahul", 22, 50000);
		Employee emp3 = new Employee("EMP3", "Jack", 25, 90000);
		Employee emp4 = new Employee("EMP4", "John", 23, 80000);
		
		List<Employee> employeeList= new ArrayList<>();
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		
		Collections.sort(employeeList,Collections.reverseOrder());
		System.out.println(employeeList);
		
		Collections.sort(employeeList,new SortEmployeeById());
		System.out.println(employeeList);
		
		Collections.sort(employeeList,new SortEmployeeByName());
		System.out.println(employeeList);
		
		Collections.sort(employeeList,new SortEmployeeByAge());
		System.out.println(employeeList);
	}

}
