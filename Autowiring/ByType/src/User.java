package com.jspider.pkg1;

public class User 
{
	private String userName;
	private Address homeAddress;
	private Address workAddress;
	@Override
	public String toString() {
		return "User [userName=" + userName + ", homeAddress=" + homeAddress + ", workAddress=" + workAddress + "]";
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
}
