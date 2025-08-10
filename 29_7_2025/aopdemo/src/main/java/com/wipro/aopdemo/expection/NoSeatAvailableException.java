package com.wipro.aopdemo.expection;

public class NoSeatAvailableException extends Exception {
	
	String message;

	public NoSeatAvailableException(String message) {
		super(message);
		 
	}

}
