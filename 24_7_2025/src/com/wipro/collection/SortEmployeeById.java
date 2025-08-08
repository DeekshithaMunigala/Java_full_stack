package com.wipro.collection;

import java.util.Comparator;

public class SortEmployeeById implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmpId().compareTo(o2.getEmpId());
	}

}
