package com.wipro.datetime;

import java.time.LocalDate;

public class LeapYearOrNot {
	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.of(2024, 01, 01);
		
		boolean result = isLeapYear(d1);
		
		System.out.println(d1.getYear() + " is a leap year? " + result );
		
	}
	
	public static boolean isLeapYear(LocalDate d1) {
		int year = d1.getYear();
		
		boolean isLeap = false;
		
		if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			isLeap = true;
		}
		
		return isLeap;
	}

}
