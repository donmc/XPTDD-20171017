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
		return new Flight("AUS", "DFW", 30000, "SW", 223);
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

	public void addMilesToMemberAndUpdateStatus(String username, int mileage) {
	
		//Update Miles
		members.get(username).setMiles(mileage); 
		int currentMiles = members.get(username).getBalanceMiles();
		//Update Status
		if (currentMiles > 25000 && currentMiles < 50000) {
			members.get(username).setStatus("Green");
		}
		if (currentMiles > 50000 && currentMiles < 75000) {
			members.get(username).setStatus("Blue");
		}
		if (currentMiles > 75000) {
			members.get(username).setStatus("Golden");
		}
	}
}
