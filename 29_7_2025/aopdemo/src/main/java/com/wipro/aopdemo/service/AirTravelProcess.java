package com.wipro.aopdemo.service;

import org.springframework.stereotype.Component;

import com.wipro.aopdemo.expection.NoSeatAvailableException;

@Component
public class AirTravelProcess {
	
	public void checkIn(boolean flag) throws NoSeatAvailableException{
		if(flag == true) {
			System.out.println("CheckIn successful");
		} else {
			throw new NoSeatAvailableException("No seats available");
		}
	}
	
	
	public void collectBoardingPass() {
		System.out.println("Bording pass collected");
	}
	
	public void doSecurityCheck() {
		System.out.println("Security check done");
	}
	
	public void doBoarding() {
		System.out.println("Bording Done");
	}
}
