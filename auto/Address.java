package com.springcore.auto;

public class Address {
	private String street;
	private String landmark;
	private int phno;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	public Address(String street, String landmark, int phno) {
		super();
		this.street = street;
		this.landmark = landmark;
		this.phno = phno;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", landmark=" + landmark + ", phno=" + phno + "]";
	}
	
	
	
}
