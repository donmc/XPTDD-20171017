package com.tddair;


public class TddAirApplication {
	
	private FlightDao flights = new FlightDao();
	
	public TddAirApplication() {
	}
	
	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
		flights.addFlight(origin, destination, mileage, airline, number);
	}

	public Flight getFlightByNumber (String flightNo) {
		return flights.getFlightBy(flightNo);
	}

	public void registerMember (String username, String email) {

	}

	public Member lookupMember (String username) {
		Member newGuy = new Member("donmc", "donmc@improving.com");
		return newGuy;
	}
}
