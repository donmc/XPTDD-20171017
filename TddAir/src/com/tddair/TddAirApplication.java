package com.tddair;

import java.util.HashMap;
import java.util.Map;


public class TddAirApplication {
	
	private Map<String, Member> memberslist = new HashMap<>();
	
	private FlightDao flights = new FlightDao();
	private Member member;
	
	public TddAirApplication() {
	}
	
	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
		flights.addFlight(origin, destination, mileage, airline, number);
	}

	public Flight getFlight(String flightno) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void registerMember(String username, String email)
	{
		member = new Member(username,email);
		
		memberslist.put(username, member);		
	}

	
	public Member lookupMember(String username) {
		// TODO Auto-generated method stub
		
		return memberslist.get(username);
	}
	

}
