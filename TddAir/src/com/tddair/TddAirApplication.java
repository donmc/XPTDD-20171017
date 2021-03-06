package com.tddair;

public class TddAirApplication {
 
	private FlightDao flights = new FlightDao();
	private MemberDao members = new FakeMemberDao();

	public TddAirApplication() {
	} 

	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
		flights.addFlight(origin, destination, mileage, airline, number);
	}

	public Flight getFlightByNumber(String flightNo) {
		return flights.getFlightBy(flightNo);
	}

	public void registerMember(String username, String email) {
		if (members.contains(username)) {
			throw new DuplicateMemberException();
		}
		
		members.register(new Member(username, email));
	}

	public Member lookupMember(String username) {
		return members.lookup(username);
	}

	public void completeFlight(String username, String flightNo) {
		Member member = members.lookup(username);
		Flight flight = flights.getFlightBy(flightNo);
		member.completeFlight(flight);
	}
}
