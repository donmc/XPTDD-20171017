package com.tddair;


public class TddAirApplication {
	
	private FlightDao flights = new FlightDao();
	
	public TddAirApplication() {
	}
	
	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
		flights.addFlight(origin, destination, mileage, airline, number);
	}

	public Flight getFlightByNumber(String flightNo) {
		// TODO Auto-generated method stub
		return flights.getFlightBy(flightNo);
	}

	public void registerMember(String username, String email) {
		// TODO Auto-generated method stub
		
	}

	public Member lookupMember(String username) {
		// TODO Auto-generated method stub
		Member newMember = new Member();
		newMember.setUsername(username);
		return newMember;
	}
}
