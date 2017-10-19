package com.tddair;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class WhenCompletingFlight {

	private TddAirApplication app;
	private Member member;
	
	@Before
	public void given() {
		app = new TddAirApplication();
		app.registerMember("donmc", "don@improving.com");
		member = app.lookupMember("donmc");
		app.completeFlight("donmc", "QF191");

		app.addFlight("WWW", "SSS", 20000, "TS", 20000);
		app.addFlight("WWW", "SSS", 50000, "TS", 50000);
	}
	
	@Test
	public void shouldKeepRedStatus() {
		assertEquals(Status.Red, member.getStatus());
	}
	
	@Test
	public void shouldCollectYtdMiles() {
		assertEquals(7490, member.getYtdMiles());
	}
	
	@Test
	public void shouldCollectBalanceMiles() {
		assertEquals(17490, member.getBalanceMiles());
	}

	@Test
	public void shouldGoGreen() {
		app.completeFlight("donmc", "TS20000");
		assertEquals(Status.Green, member.getStatus());
	}
	
	@Test
	public void shouldGoBlue() {
		app.completeFlight("donmc", "TS50000");
		assertEquals(Status.Blue, member.getStatus());
	}
	

	 @Test
	public void shouldGoGold() {
		app.completeFlight("donmc", "TS50000");
		app.completeFlight("donmc", "TS50000");
		assertEquals(Status.Gold, member.getStatus());
	}
}
