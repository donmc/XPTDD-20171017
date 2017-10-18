package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WhenRegisteringMember {
	private Member member;
	
	@Before
	public void given() {
		//setup
		TddAirApplication app= new TddAirApplication();
		String username = "donmc";
		String email = "don@gmail.com";
				
	//execute
	 app.registerMember(username,email);
	 member = app.lookupMember(username);
	
	}

	@Test
	public void shouldBeRegistered() {
		//verify
			assertNotNull(member);
	}

}
