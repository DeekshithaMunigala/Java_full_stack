package com.wipro.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.aopdemo.expection.NoSeatAvailableException;
import com.wipro.aopdemo.service.AirTravelProcess;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws NoSeatAvailableException
    {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        
        ctx.scan("com.wipro.aopdemo");
        ctx.refresh();
        AirTravelProcess airTravelProcess = ctx.getBean(AirTravelProcess.class);
        try {
        		airTravelProcess.checkIn(false);
            airTravelProcess.collectBoardingPass();
            airTravelProcess.doSecurityCheck();
            airTravelProcess.doBoarding();
        } catch(NoSeatAvailableException e) {
        		System.out.println(e.getMessage());
        }
        
    }
}
