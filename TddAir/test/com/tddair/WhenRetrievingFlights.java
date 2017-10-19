
package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WhenRetrievingFlights {

	private Flight flight;
	private TddAirApplication app;

	@Before
	public void given() {
		app = new TddAirApplication();
		app.addFlight("AUS", "DFW", 200, "SW", 223);
		
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
	public void shouldHaveCorrectDestination() {
		assertEquals("DFW", flight.getDestination());
	}
	
	@Test
	public void shouldHaveCorrectOrigin() {
		assertEquals("AUS", flight.getOrigin());
	}
	
	@Test
	public void shouldRetriveMultipleFlights() {
		app.addFlight("LAX", "LGA", 3000, "AA", 2234);
		Flight secondFlight = app.getFlightByNumber("AA2234");
		assertEquals("AA2234", secondFlight.getFullFlightNumber());
		
	}
	

}
