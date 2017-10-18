package com.tddair;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class FlightTest {

    @Test
    public void testGetFullFlightNumber_Success() {
    	//Setup
        Flight flight = new Flight("DFW", "ORD", 915, "AA", 1720);
        
        //Execute
        String flightNo = flight.getFullFlightNumber();

        //Verify
        assertEquals("AA1720", flightNo);
    }
    
    @Test
    public void testGetFullFlightNumber_NullAirline() {
    	//Setup
    	String airline = null;
        Flight flight = new Flight("DFW", "ORD", 915, airline, 1720);
        
        //Execute
        String flightNo = flight.getFullFlightNumber();

        //Verify
        assertEquals("UNKNOWN", flightNo);
    }

    @Test
    public void testGetFullFlightNumber_NoNumber() {
    	//Setup
    	int number = 0;
        Flight flight = new Flight("DFW", "ORD", 915, "AA", number);
        
        //Execute
        String flightNo = flight.getFullFlightNumber();

        //Verify
        assertEquals("UNKNOWN", flightNo);
    }
} 