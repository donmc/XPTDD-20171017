package com.tddair;

public interface MemberDao {

	Member lookup(String username);

	void register(Member member);

	boolean contains(String username);

}
