package com.tddair;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by John_Krauskopf on 10/17/2017.
 */
public class FlightTest {
    @Test
    public void getFullFlightNumber() throws Exception {
        Flight flight = new Flight ("AIB", "ORD", 900, "AA", 1234);
        //System.out.println (flight.getFullFlightNumber());
        assertEquals("AA1234", flight.getFullFlightNumber());
    }

}