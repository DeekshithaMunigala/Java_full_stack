package com.wipro.stream;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) { 
		
//		Optional<Integer> num = Optional.ofNullable(42); // 42
//		Optional<Integer> num = Optional.of(42); // 42
//		Optional<Integer> num = Optional.empty(); // 7
		
		
		Optional<Integer> num = Optional.ofNullable(null); // 7
		
		num.ifPresent(n -> System.out.println(n));

		Integer defaultValue = num.orElse(7);
		
		System.out.println(defaultValue);

	}

}
