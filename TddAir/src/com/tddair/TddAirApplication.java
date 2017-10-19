package com.tddair;

import java.util.HashMap;
import java.util.Map;

public class TddAirApplication {
	
	private FlightDao flights = new FlightDao();
	private MemberDAO members2 = new MemberDAO();
	private Map<String,Member> members = new HashMap<>();
	
	public TddAirApplication() {
	}
	
	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
		flights.addFlight(origin, destination, mileage, airline, number);
	}

	public Flight getFlightByNumber(String flightNo) {
		return flights.getFlightBy(flightNo);
	}

	public void registerMember(String username, String email) throws Exception {
		if (!members.containsKey(username)) {
			Member member = new Member(username, email);
			members.put(member.getUserName(),member);	
		}
		else {
			throw new Exception ("Username already exists");
		}	
	}

	public void registerMember2(String username, String email) throws Exception {
		members2.addMember(username, email);	
	}

	public Member lookupMember(String username) {
		return members.get(username);		
	}
	public Member lookupMember2(String username) {
		return members2.lookupMember(username);		
	}
	
	public boolean completeFlight(String username, String flightNo) {
		Member thisMember = lookupMember(username);
		Flight thisFlight = getFlightByNumber(flightNo);
		int milage = thisFlight.getMileage();
		thisMember.incrementMileBalance(milage);
		thisMember.incrementYTDMiles(milage);
		return true;
	}
	

}
