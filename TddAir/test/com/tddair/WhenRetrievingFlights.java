package com.tddair;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class WhenRetrievingFlights {
	
	private Flight flight;
	private TddAirApplication app;

	@Before
	public void given() {
		//Setup
		TddAirApplication app = new TddAirApplication();
		app.addFlight("AUS", "DFW", 200, "SW", 223);
				
		flight = app.getFlightByNumber("SW223");
	}
	
	@Test
	public void shouldReturnAFlight() {
		//Verify
		assertNotNull(flight);
	}
	
	@Test
	public void shouldHaveCorrectFlightNo() {
		//Verify
		assertEquals("SW223", flight.getFullFlightNumber());
	}

	@Test
	public void shouldHaveCorrectDestination() {
		//Verify
		assertEquals("DFW", flight.getDestination());
	}
	
	@Test
	public void shouldHaveCorrectOrigin() {
		//Verify
		assertEquals("AUS", flight.getOrigin());
	}
	
	@Ignore @Test
	public void shouldRetrieveMultipleFlights() {
		app.addFlight("LAX", "SFO", 200, "9W", 123);
		
	}
}
