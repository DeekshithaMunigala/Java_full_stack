package com.wipro.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ex10: Create a Local date object for 1st November 2023 and print it like 01-11-2023
		LocalDate d1 = LocalDate.of(2023, Month.NOVEMBER, 01);
		System.out.println(d1);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		String fDate = d1.format(formatter);
		System.out.println(fDate);

	}

}
