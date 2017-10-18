package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WhenRegisteringMember {

	private Member member;

	@Before
	public void given() {
		// setup 
		TddAirApplication app = new TddAirApplication();
		String username = "donmc";
		String email   = "don@improving.com";
		
		// execute
		app.registerMember(username, email);
		
		member = app.lookupMember(username);
	}
	
	@Test
	public void shouldBeRegistered() {
		assertNotNull(member);
	}

	@Test
	public void shouldHaveCorrectUsername() {
		assertEquals("donmc", member.getUsername());
	}
	@Test
	public void shouldHaveCorrectEmail() {
		assertEquals("don@improving.com", member.getEmail());
	}
	
	@Test
	public void shouldHaveRedStatus() {
		assertEquals(Status.Red, member.getStatus());
	}
	
	@Test
	public void shouldHave0YtdMiles() {
		assertEquals(0, member.getYtdMiles());
	}
	
	@Test
	public void shouldHave10000BalanceMiles() {
		assertEquals(10000, member.getBalanceMiles());
	}
}
