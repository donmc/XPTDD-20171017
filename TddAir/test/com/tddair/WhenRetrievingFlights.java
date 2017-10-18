package com.tddair;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WhenRetrievingFlights {

    private Flight flight;

    @Before
    public void given(){
        //setup
        TddAirApplication app = new TddAirApplication();
        app.addFlight("AUS", "DFW", 200, "SW", 223);

        //execute
        Flight flight = app.getFlightByNumber("SW223");

    }

    @Test
    public void shouldReturnAFlight(){
        //verify
        assertNotNull(flight);
    }

    @Test
    public void shouldHaveCorrectFlightNo(){
        //verify
        assertEquals("SW223", flight.getFullFlightNumber());

    }



}