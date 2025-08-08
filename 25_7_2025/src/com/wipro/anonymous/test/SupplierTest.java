package com.wipro.anonymous.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		

		Supplier<DayOfWeek> day = () -> LocalDate.now().plusDays(1).getDayOfWeek();
		DayOfWeek tomorrow = day.get();
		System.out.println("Tomorrow is : "+ tomorrow);

		Supplier<String> fullDay = () -> LocalDate.now().plusDays(1).getDayOfWeek().toString();
		System.out.println("Tomorrow is : "+ fullDay.get());
		
	}

}
