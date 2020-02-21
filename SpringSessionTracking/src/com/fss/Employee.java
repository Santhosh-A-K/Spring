package com.fss;

public class Employee {
	
	String employeeName;
	String employeeCity;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String employeeName, String employeeCity) {
		super();
		this.employeeName = employeeName;
		this.employeeCity = employeeCity;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeCity() {
		return employeeCity;
	}
	public void setEmployeeCity(String employeeCity) {
		this.employeeCity = employeeCity;
	}
	

}
