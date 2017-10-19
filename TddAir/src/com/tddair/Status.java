package com.tddair;

public enum Status {
	Red(0, 10000), Green(25000, 9000), Blue(50000, 8000), Gold(75000, 7000);

	private final int milesCost;
	private int threshold;

	private Status(int threshold, int milesCost) {
		this.threshold = threshold;
		this.milesCost = milesCost;
	}

	public int getMilesCost() {
		return milesCost;
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

}
