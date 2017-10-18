package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

public class WhenRetrievingFlights {
	
	

	TddAirApplication app;
	private Flight flight;
	private Flight secondFlight;

	@Before
	public void given() {
		//setup
		app = new TddAirApplication();
		app.addFlight("AUS",  "DFW",  200, "SW", 223);
		
		flight = app.getFlightByNumber("SW223");
	}
	
	@Test
	public void shouldReturnAFlight() {
		assertNotNull(flight);
	}
	
	@Test
	public void shouldHaveCorrectFlightNo() {
		assertEquals("SW223", flight.getFullFlightNumber());
	}
	
	@Test
	public void shouldReturnMultipleFlights() {
		
		app.addFlight("LAX", "LGA", 3000, "AA", 2234);
		secondFlight = app.getFlightByNumber("AA2234");
		assertEquals("AA2234", secondFlight.getFullFlightNumber());
	}

}
