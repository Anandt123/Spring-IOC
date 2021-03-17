package com.jspiders.pkg2;

public class Lunch 
{
	
	public Lunch(String roti) {
		super();
		this.roti = roti;
	}

	public Lunch()
	{
		System.out.println("It's Lunch time...");
	}
	private String roti;

	public String getRoti() {
		return roti;
	}

	public void setRoti(String roti) {
		this.roti = roti;
	}
	
	public void hadLunch()
	{
		System.out.println("Had curi with ["+getRoti()+"] in Lunch.");
	}
}
