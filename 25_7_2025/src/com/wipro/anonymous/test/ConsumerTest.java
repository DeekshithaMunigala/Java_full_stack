package com.wipro.anonymous.test;

import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		
		Consumer<Integer> nextEvenNumber = (num) -> {
			System.out.println(num % 2 == 0 ? num + 2 : num + 1);
		};
		nextEvenNumber.accept(101);
	}

}
