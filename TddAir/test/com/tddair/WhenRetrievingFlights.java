package com.tddair;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;



public class WhenRetrievingFlights {
	
	private Flight flight;
	private TddAirApplication app;
	
	@Test
	public void shouldHaveCorrectFlightno()	{
		app = new TddAirApplication();
		app.addFlight("AUS", "DFW", 200, "SW",223);
		
		flight=app.getFlightByNumber("SW223");
		
		
	}	
	
	@Test
	public void shouldReturnAFlight() {
		
		assertNotNull(flight);
	}
	
	@Ignore @Test
	public void shouldHaveCorrectFlightNo() {
		assertEquals("DFW", "SSS", 999);	 
	}
	
	@Test
	public void shouldRetriveMultipleFlights() {
		// TODO Auto-generated method stub
		app.addFlight("LAX", "LGA", 3000, "AA", 2234);
		//Flight secondFlight=app.getFlightByNumber(flightNo)

	}
	

}
