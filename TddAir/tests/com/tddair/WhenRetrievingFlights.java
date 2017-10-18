package com.tddair;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by John_Krauskopf on 10/17/2017.
 */
public class WhenRetrievingFlights {

    private Flight flight;
    private TddAirApplication app;

    @Before
    public void given() {
        //setup
        app = new TddAirApplication();
        app.addFlight("AUS","DFW", 200, "SWA", 223);

        //execute
         flight = app.getFlightByNumber ("SWA223");
    }

    @Test
    public void shouldHaveCorrectFlightNo() {

        //verify
        assertEquals("SWA223", app.getFlightByNumber("SWA223").getFullFlightNumber());
    }

    @Test
    public void shouldHaveCorrectFlightNo2 () {

        //verify
        assertNotNull(flight);
    }

    @Test
    public void shouldHaveCorrectFlightNOs() {

        //verify
        app.addFlight("HOB", "AUS", 500, "AAA", 444);
        assertEquals("AAA444", app.getFlightByNumber("AAA444").getFullFlightNumber());
    }
}