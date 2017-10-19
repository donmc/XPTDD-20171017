package com.tddair;

public class Member {
	String username;
	String email;
	String status;
	int YTDmiles;
	int mileBalance;
	
	public Member (String username, String email) {
		this.username = username;
		this.email = email;
		this.status = "Red";
		this.YTDmiles = 0;
		this.mileBalance = 10000;
	}
	
	public String getUserName() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	public String getStatus() {
		return status;
	}

	public int getYTDMiles() {
		return YTDmiles;
	}

	public int getMileBalance() {
		return mileBalance;
	}
	
	public void incrementYTDMiles(int mileage) {
		YTDmiles = YTDmiles + mileage;
	}
	public void incrementMileBalance(int mileage) {
		mileBalance = mileBalance + mileage;			
		}

}
