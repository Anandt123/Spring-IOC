package com.jspiders.pkg1;

public class HomeAddress 
{
	public HomeAddress()
	{
		System.out.println("This is the homeaddress class...");
	}
	
	private String city;
	
	private int pincode;
	
	public HomeAddress(String city) {
		super();
		this.city = city;
	}
	
	public HomeAddress(int pincode) {
		super();
		this.pincode = pincode;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void area()
	{
		System.out.println(getCity()+" "+getPincode());
	}
	
}

