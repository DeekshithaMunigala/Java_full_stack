package com.wipro.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insertemployee {
	
	public static void main(String[] args) {
		
		insertEmployee("John Doe", "HR");
		insertEmployee("Deekshitha", "IT");
		readEmployees();
		
	}
	
	public static void insertEmployee(String empName, String department) {
		String url = "jdbc:mysql://localhost:3306/wiprojdbc";
		String user = "root";
		String password = "Kookieee#$1997";
		
		
		  String sql = "INSERT INTO Employee (emp_name, department) VALUES (?, ?)";

		  
		  try (Connection conn = DriverManager.getConnection(url, user, password);
		            PreparedStatement pstmt = conn.prepareStatement(sql)) {

		            pstmt.setString(1, empName);
		            pstmt.setString(2, department);

		            int rowsInserted = pstmt.executeUpdate();
		            System.out.println(rowsInserted + " row(s) inserted successfully.");

		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		  

//	        try {
//	            Connection conn = DriverManager.getConnection(url, user, password);
//	            PreparedStatement pstmt = conn.prepareStatement(sql);
//	            pstmt.setString(1, "John Doe");
//	            pstmt.setString(2, "HR");
//
//	        } catch (Exception e) {
//	        		e.printStackTrace();
//	        }

	}
	
	
	public static void readEmployees() {
	    String url = "jdbc:mysql://localhost:3306/wiprojdbc";
	    String user = "root";
	    String password = "Kookieee#$1997";

	    String sql = "SELECT * FROM Employee";

	    try (Connection conn = DriverManager.getConnection(url, user, password);
	         PreparedStatement pstmt = conn.prepareStatement(sql);
	         java.sql.ResultSet rs = pstmt.executeQuery()) {

	        System.out.println("Employee Records:");
	        while (rs.next()) {
	            int id = rs.getInt("id");
	            String name = rs.getString("emp_name");
	            String dept = rs.getString("department");

	            System.out.println("ID: " + id + ", Name: " + name + ", Department: " + dept);
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

}