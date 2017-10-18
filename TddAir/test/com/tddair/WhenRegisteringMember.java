package com.tddair;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class WhenRegisteringMember {
	
	private Member member;

	@Before
	public void setup() {
		//Setup
		TddAirApplication app = new TddAirApplication();
		String username = "ABC";
		String email = "a@a.com";
		
		//Execute
		app.registerMemeber (username, email);
		member = app.lookupMember(username);
	}
	
	@Test
	public void shouldBeRegistered() {
		//Verify
		assertNotNull(member);
		
	}
}


//shouldHaveCorrectEmail
//shouldHaveCorrectUsername
//