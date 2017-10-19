package com.tddair;

import java.util.HashMap;
import java.util.Map;

public class MemberDAO {
	
	private Map<String, Member> members = new HashMap<>();
	
	public MemberDAO() {
		addMember("Amy", "amy_reed@dell.com");
		addMember(" Amy2", "amy_hindman@yahoo.com");
		addMember("Bob", "bob@what.com");
	}
	
	public Member getMemberBy(String username) {
		return members.get(username);
	}
	
	public void addMember(String username, String email) throws RuntimeException {
	
		if (!members.containsKey(username)) {
			Member member = new Member(username, email);
			members.put(member.getUserName(),member);	
		}
		else {
			throw new RuntimeException ("Username already exists");
		}
	}
	
	public Member lookupMember(String username) {
		return members.get(username);
	}

}
