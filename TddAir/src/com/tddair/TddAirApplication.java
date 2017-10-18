package com.tddair;
import java.lang.String;


public class TddAirApplication {
	
	private FlightDao flights = new FlightDao();
	private MemberDao members = new MemberDao();

	
	public TddAirApplication() {
	}
	
	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
		flights.addFlight(origin, destination, mileage, airline, number);
	}

	public Flight getFlightByNumber(String flightNo) {
		return new Flight("DDD", "SSS", 999);
	}

    public void registerMember(String username, String email) {
        members.addMember(username, email);
    }

    public Member lookupMember(String username) {
	    return members.getMemberByUsername(username);
    }
}
