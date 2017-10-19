package com.tddair;

import java.util.HashMap;
import java.util.Map;

public class FakeMemberDao implements MemberDao {

	private Map<String, Member> members = new HashMap<>();
	
	@Override
	public boolean contains(String username) {
		return members.containsKey(username);
	}

	@Override
	public void register(Member member) {
		members.put(member.getUsername(), member);
	}

	@Override
	public Member lookup(String username) {
		return members.get(username);
	}

}
