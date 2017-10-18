package com.ttdair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.tddair.Flight;
import com.tddair.TddAirApplication;

public class WhenRetrivingFlights {
	
	
	private Flight flight;


	@Before
	public void given(){
		
		//Setup
		
		TddAirApplication app = new TddAirApplication();
		app.addFlight("AUS", "ATL", 500, "AA", 223);
			 
		flight = app.getFlight("AA223");
	
	}

	@Test
	public void shouldhaveCorrectFlightNo() {

	assertEquals("AA223", flight.getFullFlightNumber());
	}
	
	@Test
	public void shouldReturnFlight(){
		
		assertNotNull(flight);
		
	}
	

}
