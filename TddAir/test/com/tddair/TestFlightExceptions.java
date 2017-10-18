package com.tddair;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFlightExceptions {

	@Test
	public void testNullOrigin() {
		try {
		new Flight(null, "ORD", 900, "AA", 1720);
		fail("Should throw illegal argument exception!");
		}
		catch (IllegalArgumentException e) {
		assertEquals(e.getMessage(), "Invalid origin code");
		}
	}
	@Test
	public void testShortOrigin() {
			try {
			new Flight("AU", "ORD", 900, "AA", 1720);
			fail("Should throw illegal argument exception!");
			}
			catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), "Invalid origin code");
			}
	}
	@Test
	public void testShortDestination() {
			try {
			new Flight("AUS", "OR", 900, "AA", 1720);
			fail("Should throw illegal argument exception!");
			}
			catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), "Invalid destination code");
			}
	}
	
	@Test // doesn't work if catching exception below(expected=IllegalArgumentException.class)
	public void testNullDestination() {
		try {
		new Flight("AUS", null, 900, "AA", 1720);
		fail("Should throw illegal argument exception!");
		}
		catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), "Invalid destination code");
		}
	}
}
