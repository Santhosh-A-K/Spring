package com.fss;

public class Customer {
	
	String name;
	long phoneNumber;
	String emailId;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String name, long phoneNumber, String emailId) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", phoneNumber=" + phoneNumber + ", emailId=" + emailId + "]";
	}
	

}
