package com.jspiders.pkg3;

public class WithGF 
{
	public WithGF()
	{
		System.out.println("On long Drive with my gf..");
	}
	private String juice;

	public String getJuice() {
		return juice;
	}

	public void setJuice(String juice) {
		this.juice = juice;
	}
	public void ondrive()
	{
		System.out.println("On a long drive with GF having "+getJuice());
	}
}
