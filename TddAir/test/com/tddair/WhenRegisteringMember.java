package com.tddair;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class WhenRegisteringMember {
	
	private Member member;

	@Before
	public void given() {
		TddAirApplication app = new TddAirApplication();
		String username= "donmc";
		String email = "don@improving.com";
				
		//execute
		app.registerMember(username, email);
				
		member = app.lookupMember(username);
	}

	@Test
	public void shouldBeRegistered() {
		assertNotNull(member);
	}

	// should have correct username
	@Test
	public void shouldHaveCorrectUsername() {
		assertEquals("donmc", member.getUserName());
	}
	// should have correct email
	// should have red status
	// should have 0 ytd miles
	// should have 100000 balance miles
	
	
}
