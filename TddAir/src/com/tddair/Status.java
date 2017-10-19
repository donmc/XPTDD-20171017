package com.tddair;

public enum Status {
	Red(0, 10000, 100), Green(25000, 9000, 90), Blue(50000, 8000, 75), Gold(75000, 7000, 60);

	private int threshold;
	private int seatUpgradeCostMiles;
	private int seatUpgradeCostDollars;

	private Status(int threshold, int seatUpgradeCostMiles, int seatUpgradeCostDollars) {
		this.threshold = threshold;
		this.seatUpgradeCostMiles = seatUpgradeCostMiles;
		this.seatUpgradeCostDollars = seatUpgradeCostDollars;
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
		return seatUpgradeCostMiles;
	}

	public int getSeatUpgradeCostDollars() {
		return seatUpgradeCostDollars;
	}

}
