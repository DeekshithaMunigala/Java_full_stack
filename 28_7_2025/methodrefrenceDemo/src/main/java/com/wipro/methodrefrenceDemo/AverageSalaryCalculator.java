package com.wipro.methodrefrenceDemo;

import java.util.ArrayList;

public class AverageSalaryCalculator {

	public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee("John", 25, 40000));
        employees.add(new Employee("Alice", 35, 60000));
        employees.add(new Employee("Bob", 40, 70000));
        employees.add(new Employee("Charlie", 20, 30000));
        employees.add(new Employee("David", 38, 55000));
		
		double totalSalary = 0;
		int count = 0;
		
		for(Employee emp:employees) {
			if(emp.empAge > 30 && emp.empSalary > 50000) {
				totalSalary += emp.empSalary;
				count++;
			}
		}
		
		if(count > 0 ) {
			double avgSalary = totalSalary / count;
			System.out.println(avgSalary);
		}
        
        
        
	}

}
