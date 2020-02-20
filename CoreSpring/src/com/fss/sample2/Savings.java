package com.fss.sample2;

public class Savings {
	
	int savingsId;
	String savingsType;
	double balanceAmount;
	public Savings() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Savings(int savingsId, String savingsType, double balanceAmount) {
		super();
		this.savingsId = savingsId;
		this.savingsType = savingsType;
		this.balanceAmount = balanceAmount;
	}
	public int getSavingsId() {
		return savingsId;
	}
	public void setSavingsId(int savingsId) {
		this.savingsId = savingsId;
	}
	public String getSavingsType() {
		return savingsType;
	}
	public void setSavingsType(String savingsType) {
		this.savingsType = savingsType;
	}
	public double getBalanceAmount() {
		return balanceAmount;
	}
	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}
	public String toString() {
		return "Savings [savingsId=" + savingsId + ", savingsType="
				+ savingsType + ", balanceAmount=" + balanceAmount + "]";
	}
	

}
