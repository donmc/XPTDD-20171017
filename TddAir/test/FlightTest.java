

import static org.junit.Assert.*;

import org.junit.Test;

import com.tddair.Flight;

public class FlightTest {

	 @Test
	    public void testGetFullFlight_success()
	    {
	        Flight flight = new Flight("AUS","ATL",500,"AA", 1722);

	        String flightno = flight.getFullFlightNumber();

	        assertEquals("AA1722", flightno);
	    }


	    @Test
	    public void testFullFlightNullAirline()
	    {
	        Flight flight = new Flight("AUS","ATL",500);

	        String flightno = flight.getFullFlightNumber();
	        assertEquals("UNKNOWN", flightno);
	    }

	    @Test
	    public void testFullFlight_noNumber()
	    {

	    }

}
