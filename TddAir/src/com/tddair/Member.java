package com.tddair;

public class Member {
	
	private String username;
	private String email;
	private String status;
	private int ytd;
	private int balanceMiles;
	
	public Member (String username, String email) {
		this.username = username;
		this.email = email;
		this.status = "Red";
		this.ytd = 0;
		this.balanceMiles = 10000;
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}

	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	public String getStatus() {
		// TODO Auto-generated method stub
		return status;
	}

	public int getYTDMiles() {
		// TODO Auto-generated method stub
		return ytd;
	}
	
	public void setMiles(int mileage) {
		this.ytd = this.ytd + mileage;
		this.balanceMiles = this.balanceMiles + mileage;
	}

	public int getBalanceMiles() {
		// TODO Auto-generated method stub
		return balanceMiles;
	}

	public void setStatus(String status) {
		// TODO Auto-generated method stub
		this.status = status;
	}
	
}
