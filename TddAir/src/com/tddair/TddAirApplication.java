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

	public void registerMember(String username, String email) throws Exception {
		if ( SearchMemberListForUsername(username) == null ) {
			Member member = new Member(username, email);
			members.add(member);	
		}
		else {
			throw new Exception ("Username already exists");
		}
		
		
		
	}

	public Member lookupMember(String username) {
		return SearchMemberListForUsername(username);
		
	}
	
	private Member SearchMemberListForUsername(String username) {
		for ( Member thisMember: members) {
			if ( thisMember.getUserName().equals(username) ) {
				return thisMember;
			}
		}
		return null;
	}
}
