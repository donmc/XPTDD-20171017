package com.tddair;

public class Member {
	String username;
	String email;
	
	public Member (String username, String email) {
		this.username = username;
		this.email = email;
	}
	
	public String getUserName() {
		return username;
	}

}
