package com.fss.sample1;


public class Address {
	
	int flatNo;
	String streetName;
	String cityName;
	long pinCode;
	public Address() {
		super();

	}
	public Address(int flatNo, String streetName, String cityName, long pinCode) {
		super();
		this.flatNo = flatNo;
		this.streetName = streetName;
		this.cityName = cityName;
		this.pinCode = pinCode;
	}
	public int getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public long getPinCode() {
		return pinCode;
	}
	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}
	
	public String toString() {
		return "Address [flatNo=" + flatNo + ", streetName=" + streetName
				+ ", cityName=" + cityName + ", pinCode=" + pinCode + "]";
	}
	

}

