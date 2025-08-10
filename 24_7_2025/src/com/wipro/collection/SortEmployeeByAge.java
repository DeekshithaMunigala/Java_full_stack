package com.wipro.collection;

import java.util.Comparator;

public class SortEmployeeByAge implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		Integer i1 = Integer.valueOf(o1.getEmpAge());
		Integer i2 = Integer.valueOf(o2.getEmpAge());
		
		return i1.compareTo(i2);
	}

}
