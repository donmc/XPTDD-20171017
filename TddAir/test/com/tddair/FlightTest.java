package com.tddair;

import org.junit.Ignore;

import static org.junit.Assert.*;

public class FlightTest {
    @org.junit.Test
    public void getFullFlightNumber_success() throws Exception {
        // setup
        String air = "AA";
        int miles = 1720;
        Flight flight = new Flight("DFW", "ORD", 915, air, miles);

        // execute
        String flightNo = flight.getFullFlightNumber();

        // verify
        assertEquals("AA1720", flightNo);
    }

    @org.junit.Test
    public void getFullFlightNumber_noAirline() throws Exception {
        // setup
        String airline = null;
        int miles = 1720;
        Flight flight = new Flight("DFW", "ORD", 915, airline, miles);

        // execute
        String flightNo = flight.getFullFlightNumber();

        // verify
        assertEquals("UNKNOWN", flightNo);
    }

    @org.junit.Test
    public void getFullFlightNumber_noFlightNumber() throws Exception {
        // setup
        String airline = "AA";
        int miles = 0;
        Flight flight = new Flight("DFW", "ORD", 915, airline, miles);

        // execute
        String flightNo = flight.getFullFlightNumber();

        // verify
        assertEquals("UNKNOWN", flightNo);
    }


    @Ignore @org.junit.Test
    public void getDestination() throws Exception {
    }

    @org.junit.Test
    public void getOrigin() throws Exception {
    }

    @org.junit.Test
    public void getMileage() throws Exception {
    }

}