package com.tddair;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Ignore;

public class FlightTest {

	@Test
	public void testGetFullFlightNumber_success() {
		// setup
		Flight flight = new Flight("DFW", "ORD", 915, "AA", 1720);
		
		// execute
		String flightNo = flight.getFullFlightNumber();
		
		// verify
		assertEquals("AA1720", flightNo);
		
	}
	@Test
	public void testGetFullFlightNumber_nullFlight() {
		// setup
		Flight flight = new Flight ("DFW", "ORD", 915, null, 1720);
		
		// execute
		String flightNo = flight.getFullFlightNumber();
		
		// verify
		assertEquals("UNKNOWN", flightNo);

	}
	@Test
	public void testGetFullFlightNumber_noNumber() {
		// setup
		Flight flight = new Flight ("DFW", "ORD", 915, "AA", 0);
				
		// execute
		String flightNo = flight.getFullFlightNumber();
				
		// verify
		assertEquals("UNKNOWN", flightNo);
	}

}
