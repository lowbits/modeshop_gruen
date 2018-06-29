package com.uni.modehausgruen.model;

public class Customer {
	private String firstname;
	private String lastname;
	private String street;
	private Float sales;
	
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getFirstname() {
		return this.firstname;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getStreet() {
		return this.street;
	}
	
	public String toString() {
		return getFirstname() + " " + getStreet();
	}
	

}
