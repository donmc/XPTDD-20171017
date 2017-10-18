package com.ttdair;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Before;
import org.junit.Test;

import com.tddair.Member;
import com.tddair.TddAirApplication;

public class When_Register_A_Member {

	private Member member;

	@Before
	public void test() {
		// setup
		TddAirApplication tdapp = new TddAirApplication();
		String username = "arun7878";
		String email = "ar@gmail.com";

		// execute
		tdapp.registerMember(username, email);

		// verify
		member = tdapp.lookupMember(username);
	}
	
	@Test
	public void shoudBeRegistered()
	{	
		assertNotNull(member);
	}
	
	
	@Test
	public void shouldHaveCorrectUserName()
	{
		String pattern = "([^$#]*)";
		Pattern r = Pattern.compile(pattern);

		Matcher m = r.matcher(member.getUserName());

		assertNotNull(m);
	}
	
	@Test
	public void shoudHaecorrectEmail()
	{
		String pattern = "([*@*])";
		Pattern r = Pattern.compile(pattern);

		Matcher m = r.matcher(member.getEmail());
		assertNotNull(m);
	}
}
