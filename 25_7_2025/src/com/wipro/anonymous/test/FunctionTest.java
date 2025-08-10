package com.wipro.anonymous.test;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		
		Function<Double, Double> fractionalPart = (num) ->  {
			double result = Math.round((num - Math.floor(num)) * 1000.0) / 1000.0;
			return result;
		};

		
		double input = 123.45;
		double result = fractionalPart.apply(input);
		
		System.out.println(result);
		
	}

}
