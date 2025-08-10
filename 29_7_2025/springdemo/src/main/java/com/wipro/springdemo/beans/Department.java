package com.wipro.springdemo.beans;

public class Department {
	String departmentName;
	String departmentCode;
	
	
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Department(String departmentName, String departmentCode) {
		super();
		this.departmentName = departmentName;
		this.departmentCode = departmentCode;
	}



	public String getDepartmentName() {
		return departmentName;
	}



	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}



	public String getDepartmentCode() {
		return departmentCode;
	}



	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}



	@Override
	public String toString() {
		return "Department [departmentName = " + departmentName + ", departmentCode = " + departmentCode + "]";
	}
	
	
}
