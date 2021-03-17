package com.jspiders.pkg2;

public class Breakfast 
{
	
	public Breakfast(String idli) {
		super();
		this.idli = idli;
	}

	public  Breakfast() {
		System.out.println("It's Breakfast time...");
	}
	private String idli;

	public String getIdli() {
		return idli;
	}

	public void setIdli(String idli) {
		this.idli = idli;
	}
	public void hadBreakfast()
	{
		System.out.println("Had chatni with ["+getIdli()+"] in Breakfast.");
	}
}
