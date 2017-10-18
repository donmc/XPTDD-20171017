package com.tddair;

import java.util.ArrayList;

public class TddAirApplication {
	
	private FlightDao flights = new FlightDao();
	private ArrayList<Member> members = new ArrayList<>();
	
	public TddAirApplication() {
	}
	
	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
		flights.addFlight(origin, destination, mileage, airline, number);
	}

	public Flight getFlightByNumber(String flightNo) {
		return flights.getFlightBy(flightNo);
	}

	public void registerMember(String username, String email) {
		Member member = new Member(username, email);
		members.add(member);
		
	}

	public Member lookupMember(String username) {
		for ( Member thisMember: members) {
			if ( thisMember.getUserName().equals(username) ) {
				return thisMember;
			}
		}
		return null;
	}
}
