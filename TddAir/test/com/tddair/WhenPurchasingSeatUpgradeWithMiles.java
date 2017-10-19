package com.tddair;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class WhenPurchasingSeatUpgradeWithMiles {
	
	private Member member;
	private TddAirApplication app;
	private String username;
	private String email;
	private Flight flight;
	private int noOfSeatUpgrades;

	@Before
	public void setup() {
		//Setup
		app = new TddAirApplication();
		username = "ABC";
		email = "a@a.com";
				
		//Execute
		app.registerMemeber (username, email);
		//flight = app.getFlightByNumber("SW223");
		//app.addMilesToMemberAndUpdateStatus(username, flight.getMileage());
		member = app.lookupMember(username);
	}
	
	@Test
	public void shouldBeUpgradedForRed() {
		//Verify
		noOfSeatUpgrades = 1;
		assertTrue(member.performUpgrade(noOfSeatUpgrades));
	}
	
	@Test
	public void shouldBeUpgradedForGreen() {
		//Verify
		flight = app.getFlightByNumber("SW223");
		app.addMilesToMemberAndUpdateStatus(username, flight.getMileage());		
		noOfSeatUpgrades = 1;
		assertTrue(member.performUpgrade(noOfSeatUpgrades));
	}
	
	@Test
	public void shouldBeUpgradedForBlue() {
		//Verify
		flight = app.getFlightByNumber("SW223");
		app.addMilesToMemberAndUpdateStatus(username, flight.getMileage());
		app.addMilesToMemberAndUpdateStatus(username, flight.getMileage());
		noOfSeatUpgrades = 1;
		assertTrue(member.performUpgrade(noOfSeatUpgrades));
	}
	
	@Test
	public void shouldBeUpgradedForGold() {
		//Verify
		flight = app.getFlightByNumber("SW223");
		app.addMilesToMemberAndUpdateStatus(username, flight.getMileage());
		app.addMilesToMemberAndUpdateStatus(username, flight.getMileage());
		app.addMilesToMemberAndUpdateStatus(username, flight.getMileage());
		app.addMilesToMemberAndUpdateStatus(username, flight.getMileage());
		noOfSeatUpgrades = 1;
		assertTrue(member.performUpgrade(noOfSeatUpgrades));
	}
	@Test
	public void shouldNotBeUpgradedForRed() {
		//Verify

		noOfSeatUpgrades = 2;
		assertFalse(member.performUpgrade(noOfSeatUpgrades));
	}
	
	@Test
	public void shouldNotBeUpgradedForGreen() {
		//Verify
		flight = app.getFlightByNumber("SW223");
		app.addMilesToMemberAndUpdateStatus(username, flight.getMileage());
		noOfSeatUpgrades = 5;
		assertFalse(member.performUpgrade(noOfSeatUpgrades));
	}
	@Test
	public void shouldNotBeUpgradedForBlue() {
		//Verify
		flight = app.getFlightByNumber("SW223");
		app.addMilesToMemberAndUpdateStatus(username, flight.getMileage());
		app.addMilesToMemberAndUpdateStatus(username, flight.getMileage());
		noOfSeatUpgrades = 9;
		assertFalse(member.performUpgrade(noOfSeatUpgrades));
	}
	@Test
	public void shouldNotBeUpgradedForGolden() {
		//Verify
		flight = app.getFlightByNumber("SW223");
		app.addMilesToMemberAndUpdateStatus(username, flight.getMileage());
		app.addMilesToMemberAndUpdateStatus(username, flight.getMileage());
		app.addMilesToMemberAndUpdateStatus(username, flight.getMileage());
		app.addMilesToMemberAndUpdateStatus(username, flight.getMileage());
		noOfSeatUpgrades = 20;
		assertFalse(member.performUpgrade(noOfSeatUpgrades));
	}
}
