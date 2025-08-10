package com.wipro.exception;

//import java.util.Scanner;

public class FirstException {
	public static void main(String[] args) {
		String fName = null;
		try {
			String uppercase = fName.toUpperCase();
			
			System.out.println(uppercase);
			
		} catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: fName is null and cannot be converted to uppercase.");
        } catch (Exception ex) {
        		ex.printStackTrace();
        }
	}
}
