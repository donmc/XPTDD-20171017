package com.tddair;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class FlightTest {

	@Test
	public void testGetFullFlightNumber_success() {
		// setup
		String air = "AA";
		int miles = 1720;
		Flight flight = new Flight("DFW", "ORD", 915, air, miles);
		
		// execute
		String flightNo = flight.getFullFlightNumber();
		
		// verify
		assertEquals("AA1720", flightNo);
	}
	
	@Test
	public void testGetFullFlightNumber_nullAirline() {
		// setup
		String airline = null;
		int miles = 1720;
		Flight flight = new Flight("DFW", "ORD", 915, airline, miles);
		
		// execute
		String flightNo = flight.getFullFlightNumber();
		
		// verify
		assertEquals("UNKNOWN", flightNo);
	}	
	
	@Test
	public void testGetFullFlightNumber_noNumber() {
		// setup
		String airline = "AA";
		int miles = 0;
		Flight flight = new Flight("DFW", "ORD", 915, airline, miles);
		
		// execute
		String flightNo = flight.getFullFlightNumber();
		
		// verify
		assertEquals("UNKNOWN", flightNo);
	}
}
