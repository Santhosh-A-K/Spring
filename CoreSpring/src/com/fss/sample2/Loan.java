package com.fss.sample2;

public class Loan {

	int loanID;
	String loanType;
	double loanAmount;
	int loanDuration;
	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Loan(int loanID, String loanType, double loanAmount, int loanDuration) {
		super();
		this.loanID = loanID;
		this.loanType = loanType;
		this.loanAmount = loanAmount;
		this.loanDuration = loanDuration;
	}
	public int getLoanID() {
		return loanID;
	}
	public void setLoanID(int loanID) {
		this.loanID = loanID;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getLoanDuration() {
		return loanDuration;
	}
	public void setLoanDuration(int loanDuration) {
		this.loanDuration = loanDuration;
	}
	public String toString() {
		return "Loan [loanID=" + loanID + ", loanType=" + loanType
				+ ", loanAmount=" + loanAmount + ", loanDuration="
				+ loanDuration + "]";
	}
	
	
}
