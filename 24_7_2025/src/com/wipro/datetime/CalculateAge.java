package com.wipro.datetime;

import java.time.LocalDate;
import java.time.Month;

public class CalculateAge {
	
	public static void main(String[] args) {
		
		LocalDate dt = LocalDate.of(1997, Month.SEPTEMBER, 01);
		System.out.println(getAge(dt));
	
	}
	
	public static int getAge(LocalDate dt) {
		int birthYear = dt.getYear();
		int currentYear = dt.now().getYear();
		return currentYear - birthYear;
		
	}
}
