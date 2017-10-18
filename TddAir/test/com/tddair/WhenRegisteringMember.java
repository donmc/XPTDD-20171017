package com.tddair;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class WhenRegisteringMember {
	
	private Member member;
	private TddAirApplication app;
	private String username;
	private String email;

	@Before
	public void setup() {
		//Setup
		app = new TddAirApplication();
		username = "ABC";
		email = "a@a.com";
		
		//Execute
		app.registerMemeber (username, email);
		member = app.lookupMember(username);
	}
	
	@Test
	public void shouldBeRegistered() {
		//Verify
		assertNotNull(member);
	}
	
	@Test
	public void shouldHaveCorrectEmail() {
		//Verify
		assertEquals("a@a.com", member.getEmail());
	}
	
	@Test
	public void shouldHaveCorrectUsername() {
		//Verify
		assertEquals("ABC", member.getUsername());
	}
	
	@Test
	public void shouldHaveRedStatus() {
		//Verify
		assertEquals("Red", member.getStatus());
	}
	
	@Test
	public void shouldHave0YTDMiles() {
		//Verify
		assertEquals(0, member.getYTDMiles());
	}
	
	@Test
	public void shouldHave10KBalanceMiles() {
		//Verify
		assertEquals(10000, member.getBalanceMiles());
	}
	
	@Test (expected = DuplicateMemberException.class)
	public void shouldHaveDupUserName() {
		//Verify
		app.registerMemeber(username, email);
	}
}


