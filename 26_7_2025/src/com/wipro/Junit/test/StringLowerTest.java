package com.wipro.Junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class StringLowerTest {

	@ParameterizedTest
	@ValueSource(strings = {"deekshitha", "amit", "varshini"})
	void checkLowercaseOrNot(String input) {
		assertTrue(isLowercaseOrNot(input));
	}

	boolean isLowercaseOrNot(String str) {
		return str.equals(str.toLowerCase());
	}
	
}
