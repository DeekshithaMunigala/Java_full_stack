package com.wipro.test;

import com.wipro.exception.InvalidMonthException;

public class InvalidMonthExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			checkMonth(4);
		} catch(InvalidMonthException e) {
			e.printStackTrace();
		}

	}
	
	static void checkMonth(int month) throws InvalidMonthException {
		if(month < 1 || month > 12) {
			throw new InvalidMonthException("Invalid Month");
		} else {
			System.out.println("It's a valid month");
		}
		
	}

}
