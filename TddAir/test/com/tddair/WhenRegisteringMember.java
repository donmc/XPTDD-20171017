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
		String email = "donmc@improving.com";
				
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
	@Test
	public void shouldHaveCorrectEmail() {
		assertEquals("donmc@improving.com", member.getEmail());
	}
	
	// should have red status
	@Test
	public void shouldHaveCorrectStatus() {
		assertEquals("Red", member.getStatus());
	}
	// should have 0 ytd miles
	@Test
	public void shoudlHave0YTDMiles() {
		assertEquals(0, member.getYTDMiles());
	}
	// should have 100000 balance miles
	@Test
	public void shouldHave10KBalance() {
		assertEquals(10000, member.getMileBalance());
	}
}