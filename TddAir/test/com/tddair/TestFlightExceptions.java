package com.tddair;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;



public class TestFlightExceptions {

	@Test
	public void testNullOrigin() {
		try {
			new Flight(null, "ORD", 900, "AA", 1720);
			fail("Should Throw IllegalArgumentException!");
		} catch (IllegalArgumentException e) {
			assertEquals("Invalid origin code", e.getMessage());
		}
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testNullDestination_Expected() {
		new Flight("ORD", null, 900, "AA", 1720);
	}

}
