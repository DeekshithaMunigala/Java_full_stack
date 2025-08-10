package com.wipro.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.springdemo.beans.College;
import com.wipro.springdemo.beans.Department;

import org.springframework.context.ApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
//        Department department = (Department)ctx.getBean("department");
//        Department department = ctx.getBean(Department.class);
//        department.setDepartmentName("Information Technology");
//        department.setDepartmentCode("IT");
        
        College college = ctx.getBean(College.class);
        System.out.println(college);
    
    }
}
