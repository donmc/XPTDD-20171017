package com.tddair;

import java.util.HashMap;
import java.util.*;

public class TddAirApplication {
	
	private FlightDao flights = new FlightDao();
	private HashMap<String, Member> members = new HashMap<>();
	
	
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
		return members.get(username);
	}

	public void registerMemeber(String username, String email) {
		if (members.containsKey(username)) {
			throw new DuplicateMemberException();
		}
		members.put(username, new Member(username, email));
	}
}
