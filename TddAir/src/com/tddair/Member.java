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

	public Member getMember(String username) {		
	    
		return new Member(username, "email");
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return "a@a.com";
	}

	public String getUsername() {
		// TODO Auto-generated method stub
		return "ABC";
	}

	public String getStatus() {
		// TODO Auto-generated method stub
		return "Red";
	}

	public int getYTDMiles() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getBalanceMiles() {
		// TODO Auto-generated method stub
		return 10000;
	}
		
	
}
