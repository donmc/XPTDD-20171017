package com.ttdair;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tddair.Flight;

public class TestFlightExceptions {

	@Test
	public void testNullOrigin() {

		try {
			new Flight(null, "ATL", 900, "AA", 7585);

			fail("should throw legal argument exception");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			assertEquals("Invalid origin code", e.getMessage());

		}
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNulOrigin(){
		new Flight(null, "ATL", 900, "AA", 7585);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNullDestination()
	{
		new Flight("HUS", null, 900, "AA", 7585);
		
	}
	
}
