package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class WhenPurchasingSeatUpgradesWithMiles {

	private Member redGuy;
	private Member greenGuy;
	private Member blueGuy;
	private Member goldGuy;

	@Before
	public void given() {
		redGuy = new Member("redGuy", "red@guy.com");
		redGuy.purchaseSeatUpgradesWithMiles(1);

		greenGuy = new Member("greenGuy", "green@guy.com");
		greenGuy.completeFlight(new Flight("SSS", "SAA", 30000));
		blueGuy  = new Member("blueGuy", "blue@guy.com");
		blueGuy.completeFlight(new Flight("SSS", "SAA", 60000));
		goldGuy	 = new Member("goldGuy", "gold@guy.com");
		goldGuy.completeFlight(new Flight("SSS", "SAA", 90000));
	}
	
	@Test
	public void shouldSpendCorrectAmount_Green() {
		int preBalance = greenGuy.getBalanceMiles();
		greenGuy.purchaseSeatUpgradesWithMiles(1);
		int postBalance = greenGuy.getBalanceMiles();
		
		assertEquals(9000, preBalance-postBalance);
	}
	
	@Test
	public void shouldSpendCorrectAmount_Blue() {
		int preBalance = blueGuy.getBalanceMiles();
		blueGuy.purchaseSeatUpgradesWithMiles(1);
		int postBalance = blueGuy.getBalanceMiles();
		
		assertEquals(8000, preBalance-postBalance);
	}
	@Test
	public void shouldSpendCorrectAmountForMultiple_Gold() {
		int preBalance = goldGuy.getBalanceMiles();
		goldGuy.purchaseSeatUpgradesWithMiles(4);
		int postBalance = goldGuy.getBalanceMiles();
		
		assertEquals(28000, preBalance-postBalance);
	}
	
	
	
	@Test
	public void shouldSpendCorrectAmount_Red() {
		assertEquals(0, redGuy.getBalanceMiles());
	}
	
	@Test
	public void shouldIncreaseSeatUpgradeBalance() {
		assertEquals(1, redGuy.getSeatUpgradeBalance());
	}

}
