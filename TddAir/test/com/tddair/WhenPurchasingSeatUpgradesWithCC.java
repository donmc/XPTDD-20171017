package com.tddair;

import static org.junit.Assert.*;

import org.junit.Test;

public class WhenPurchasingSeatUpgradesWithCC {

	@Test
	public void shouldChargeCorrectAmount() {
		Member member = new Member("donmc", "don@cc.com");
		SpyCas spy = new SpyCas();
		member.setCas(spy);
		
		member.purchaseSeatUpgradesWithCC(SpyCas.GOOD_CC, 1);
		assertEquals(100, spy.getAmountCharged());
	}
	@Test
	public void shouldFailWithBadCC() {
		Member member = new Member("donmc", "don@cc.com");
		SpyCas spy = new SpyCas();
		member.setCas(spy);
		
		boolean valid = member.purchaseSeatUpgradesWithCC(SpyCas.BAD_CC, 1);
		assertFalse(valid);
	}

}
