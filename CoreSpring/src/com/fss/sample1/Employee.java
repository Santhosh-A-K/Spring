package com.fss.sample1;



public class Employee {
	
	int empid;
	String empName;
	double salary;
	Address employeeAddress;
	Project project;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String empName, double salary,
			Address employeeAddress, Project project) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.salary = salary;
		this.employeeAddress = employeeAddress;
		this.project = project;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Address getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(Address employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public String toString() {
		return "Employee [\nempid=" + empid + ", empName=" + empName
				+ ", salary=" + salary + ", \nemployeeAddress=" + employeeAddress
				+ ", \nproject=" + project + "\n]";
	}
	
}

