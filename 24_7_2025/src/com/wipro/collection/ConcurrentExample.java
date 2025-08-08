package com.wipro.collection;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentExample {
	public static void main(String[] args) {
		Employee emp1 = new Employee("EMP1", "Amit", 21, 70000);
		Employee emp2 = new Employee("EMP2", "Rahul", 22, 50000);
		Employee emp3 = new Employee("EMP3", "Jack", 25, 90000);
		Employee emp4 = new Employee("EMP4", "John", 23, 80000);
		
		List<Employee> employeeList= new CopyOnWriteArrayList<>();
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		
		for(Employee employee:employeeList) {
			if(employee.getEmpSalary() > 80000) {
				employeeList.remove(employee);
			}
		}
		
//		System.out.println(employeeList);
		
		for(Employee employee:employeeList) {
			System.out.println(employee);
		}
		
	}

}
