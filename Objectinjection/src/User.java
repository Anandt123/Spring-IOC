package com.jspider.pkg1;

public class User {
	private String userName;
	private Address homeAddress;
	private Address workAddress;
	private Address officeAddress;
	
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", homeAddress=" + homeAddress + ", workAddress=" + workAddress
				+ ", officeAddress=" + officeAddress + "]";
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public Address getHomeAddress() {
		return homeAddress;
	}


	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}


	public Address getWorkAddress() {
		return workAddress;
	}


	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}


	public Address getOfficeAddress() {
		return officeAddress;
	}


	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}

	
}
