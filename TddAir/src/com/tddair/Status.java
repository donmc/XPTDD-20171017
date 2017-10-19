package com.tddair;

public enum Status {
	Red(0), Green(25000), Blue(50000), Gold(75000);

	private int threshold;

	private Status(int threshold) {
		this.threshold = threshold;
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
