package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WhenCompletingFlight {
	TddAirApplication app;
	Member member;

	@Before
	public void setUp() throws Exception {
		app = new TddAirApplication();
		app.addFlight("AUS", "PDX", 7490, "QF", 191);
		app.registerMember("donmc", "donmc@improvedlearning.com");
		app.completeFlight ("donmc", "QF191");
		member = app.lookupMember("donmc");
	}

	@Test
	public void YTDMilesShouldIncrement() {
		assertEquals((long)7490, (long)member.getYTDMiles());
	}

	@Test
	public void MileBalanceSouldIncrement() {
		assertEquals((long)17490, (long)member.getMileBalance());
	}

	//statusShouldStayRedUnder25K
}
