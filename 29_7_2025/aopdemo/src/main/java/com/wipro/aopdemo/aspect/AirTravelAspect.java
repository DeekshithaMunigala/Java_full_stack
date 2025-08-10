package com.wipro.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.AfterThrowing;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AirTravelAspect {
	
	@Before("execution(* com.wipro.aopdemo.service.AirTravelProcess.checkIn(..))")
	public void showPhotoId() {
		System.out.println("----showPhotoId----");
	}
	
	@Before("execution(* com.wipro.aopdemo.service.AirTravelProcess.doSecurityCheck(..)) || execution(* com.wipro.aopdemo.service.AirTravelProcess.doBoarding(..))")
	public void showBordingPass() {
		System.out.println("----showBoardingPass----");
	}
	
	@AfterThrowing(pointcut = "execution(* com.wipro.aopdemo.service.AirTravelProcess.checkIn(..))", throwing = "ex")
	public void informAirTravelManager(JoinPoint jp, Throwable ex) {
		System.out.println("Call Air travel manager");
	}
	
	
}
