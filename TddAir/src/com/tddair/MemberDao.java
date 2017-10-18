package com.tddair;

import java.util.HashMap;
import java.util.Map;

public class MemberDao {

	private Map<String, Member> members = new HashMap<>();
	
	public boolean contains(String username) {
		return members.containsKey(username);
	}

	public void register(Member member) {
		members.put(member.getUsername(), member);
	}

	public Member lookup(String username) {
		return members.get(username);
	}

}
