package com.fss.sample2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Customer {
	String firstName;
	String lastName;
	long mobileNo;
	@Autowired
	Loan loan;
	Savings savings;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String firstName, String lastName, long mobileNo,
			Loan loan, Savings savings) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.loan = loan;
		this.savings = savings;
	}
	
	public String getFirstName() {
		return firstName;
	}
	@Required
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
/*	public Loan getLoan() {
		return loan;
	}
	public void setLoan(Loan loan) {
		this.loan = loan;
	}*/
	public Savings getSavings() {
		return savings;
	}
	@Autowired
	public void setSavings(Savings savings) {
		this.savings = savings;
	}
	public String toString() {
		return "Customer [\nfirstName=" + firstName + ", lastName=" + lastName
				+ ", mobileNo=" + mobileNo + ", \nloan=" + loan + ", \nsavings="
				+ savings + "\n]";
	}
	

}
