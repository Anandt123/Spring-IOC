package com.jspiders.pkg1;

public class WorkAddress
{
	public WorkAddress()
	{
		System.out.println("This is the WorkAddress class...");
	}
	private String state;
	
	
	public WorkAddress(String state) {
		super();
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	public void office()
	{
		System.out.println("Basavangudi,"+getState());
	}
}
