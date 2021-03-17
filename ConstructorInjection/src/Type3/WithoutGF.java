package com.jspiders.pkg3;

public class WithoutGF 
{
	
	public WithoutGF(String bear) {
		super();
		Bear = bear;
	}

	public WithoutGF()
	{
		System.out.println("On long drive Without gf...");
	}
	private String Bear;

	public String getBear() {
		return Bear;
	}

	public void setBear(String bear) {
		Bear = bear;
	}
	public void Ondrive()
	{
		System.out.println("On a long drive without GF Having "+getBear());
	}
}
