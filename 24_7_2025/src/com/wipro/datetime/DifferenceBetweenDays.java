package com.wipro.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class DifferenceBetweenDays {
	 
	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.of(1997, Month.SEPTEMBER, 01);
		LocalDate d2 = LocalDate.of(2002, Month.MARCH, 15);
		getDiffDate(d1, d2);
		
	}
	
	public static void getDiffDate(LocalDate d1, LocalDate d2) {
		if(d1.isAfter(d2)) {
			LocalDate temp = d1;
			d1 = d2;
			d2 = temp;
		}
		
		Period period = Period.between(d1, d2);
		

		System.out.println("Difference is " + 
			period.getYears() + " years " +
			period.getMonths() + " months " +
			period.getDays() + " days");
		}
	}

