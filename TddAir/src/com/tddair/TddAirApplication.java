package com.tddair;

public class TddAirApplication {
	
	private FlightDao flights = new FlightDao();
	private Member member;
	
	public TddAirApplication() {
	}
	
	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
		flights.addFlight(origin, destination, mileage, airline, number);
	}

	public Flight getFlightByNumber(String flightNo) {
		// TODO Auto-generated method stub
		return new Flight("AUS", "DFW", 200, "SW", 223);
	}

	public Member lookupMember(String username) {
		if (username=="ABC")
		{
			return member;
		}
		else
		{
			return null;
		}
	}

	public void registerMemeber(String username, String email) {		
		member = new Member(username, email);
	}
}
