package com.tddair;

public enum Status {
	Red(0, 10000), Green(25000, 9000), Blue(50000, 8000), Gold(75000, 7000);

	private int threshold;
	private int getSeatUpgradeCostMiles;

	private Status(int threshold, int seatUpgradeCostMiles) {
		this.threshold = threshold;
		this.getSeatUpgradeCostMiles = seatUpgradeCostMiles;
	}
	
	public static Status calculateStatusFor(int miles) {
		Status status = Status.Red;
		
		if (miles >= Status.Green.threshold) {
			status = Status.Green;
		}  
		if (miles >= 50000) {
			status = Status.Blue;
		} 
		
		if (miles >= 75000) {
			status = Status.Gold;
		} 
		
		return status;
	}

	public int getSeatUpgradeCostMiles() {
		return getSeatUpgradeCostMiles;
	}

}
