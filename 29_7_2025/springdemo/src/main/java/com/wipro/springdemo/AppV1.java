package com.wipro.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.springdemo.beans.Mobile;

public class AppV1 {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppV1.class);
		
		ctx.scan("com.wipro.springdemo.beans");
//		ctx.refresh();
		
		Mobile mobile = ctx.getBean(Mobile.class);
		System.out.println(mobile);
	}

}
