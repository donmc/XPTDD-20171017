package com.tddair;

import java.util.HashMap;
import java.util.Map;

public class MemberDao {

	private Map<String, Member> members = new HashMap<>();

	public MemberDao() {
		addMember("padminik", "padminik@rediff.com");
		addMember("swethas", "swethas@gmail.com");
		addMember("adamr", "adam@gmail.com");
	}
	
	public Member getMemberByUsername(String username) {
		return members.get(username);
	}
	
	public void addMember(String username, String email) {
		Member member = new Member(username, email);
		members.put(username, member);

	}
}
