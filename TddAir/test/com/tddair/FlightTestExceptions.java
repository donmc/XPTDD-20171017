package com.tddair;

import org.junit.Test;

import static org.junit.Assert.*;

public class FlightTestExceptions {

    @Test
    public void testNullOrigin() {
        try {
            new Flight(null, "ORD",900, "AA", 1720);
            fail("Should throw IllegalArgumentException!");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid origin code", e.getMessage());
        }
    }

    @Test(expected=IllegalArgumentException.class)
    public void testNullDestination() {
        new Flight("DFW", null,900, "AA", 1720);
    }

}