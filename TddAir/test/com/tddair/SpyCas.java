package com.tddair;

public class SpyCas implements Cas {

	public static final String GOOD_CC = "11111111111";
	public static final String BAD_CC = "9999999999";
	private int amountCharged;
	
	public int getAmountCharged() {
		return amountCharged;
	}

	@Override
	public boolean charge(String cc, int amount) {
		
		this.amountCharged = amount;
			
		return cc.equals(GOOD_CC);
	}

}
