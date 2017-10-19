package com.tddair;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class WhenCompletingFlights {

	private Flight flight;
	private TddAirApplication app;
	private String username;
	private String email;
	private Member member;
	

	@Before
	public void setUp() {
		//Setup
		app = new TddAirApplication();
		username = "ABC";
		email = "a@a.com";
		
		//Execute
		app.registerMemeber (username, email);
		flight = app.getFlightByNumber("SW223");
		app.addMilesToMemberAndUpdateStatus(username, flight.getMileage());
		member = app.lookupMember(username);
	}
	
	
	@Test
	public void shouldHaveUpdatedYTDMiles() {
		//Verify
		assertEquals(30000, member.getYTDMiles());
	}
	
	@Test
	public void shouldHaveUpdatedBalanceMiles() {
		//Verify
		assertEquals(40000, member.getBalanceMiles());
	}
	
	@Test
	public void shouldHaveUpdatedStatus() {
		//Verify
		assertEquals ("Green", member.getStatus());
	}
}
