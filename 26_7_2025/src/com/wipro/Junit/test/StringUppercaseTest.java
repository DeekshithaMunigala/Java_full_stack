package com.wipro.Junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringUppercaseTest {

	@Test
	void test() {
		String str = "DEEKSHITHA";
//        assertEquals(str, str.toUpperCase());
        
        assertTrue(str.equals(str.toUpperCase()));
	}
	
	
	

}
