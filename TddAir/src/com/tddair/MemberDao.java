package com.tddair;

import java.util.HashMap;
import java.util.Map;

public class MemberDao {

	private Map<String, Member> members = new HashMap<>();

	public MemberDao() {
			}
	
	public Member getMemberByUsername(String username) {
		return members.get(username);
	}
	
	public void addMember(String username, String email, String status, int ytdmiles, int balancemiles) {
		Member member = new Member(username, email,status,ytdmiles,balancemiles);
		members.put(username, member);

	}
}
