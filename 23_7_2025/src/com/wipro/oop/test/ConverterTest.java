package com.wipro.oop.test;

import com.wipro.oop.Converter;

public class ConverterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Converter print = new Converter();
		System.out.println(print.convert(4));
		System.out.println(print.convert(4, 7));
		System.out.println(print.convert(7.5));
	}

}
