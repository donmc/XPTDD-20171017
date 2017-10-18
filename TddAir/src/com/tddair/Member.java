package com.tddair;

public class Member {
	
	private String username;
	private String email;
	
	public Member (String username, String email) {
		this.username = username;
		this.email = email;
	}

	public Member getMember(String username) {		
	    
		return new Member(username, "email");
	}
		
	
}
