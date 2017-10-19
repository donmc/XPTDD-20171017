package com.tddair;

public class Member {
	
	private String username;
	private String email;
	private String status;
	private int ytd;
	private int balanceMiles;
	private int seatUpgrades;
	
	public Member (String username, String email) {
		this.username = username;
		this.email = email;
		this.status = "Red";
		this.ytd = 0;
		this.balanceMiles = 10000;
		this.seatUpgrades = 0;
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}

	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	public String getStatus() {
		// TODO Auto-generated method stub
		return status;
	}

	public int getYTDMiles() {
		// TODO Auto-generated method stub
		return ytd;
	}
	
	public void setMiles(int mileage) {
		this.ytd = this.ytd + mileage;
		this.balanceMiles = this.balanceMiles + mileage;
	}

	public int getBalanceMiles() {
		// TODO Auto-generated method stub
		return balanceMiles;
	}

	public void setStatus(String status) {
		// TODO Auto-generated method stub
		this.status = status;
	}

	public boolean performUpgrade(int noOfSeatUpgrades) {
		
		if (this.getStatus() == "Red"
				&& this.getBalanceMiles() >= (noOfSeatUpgrades * 10000)) {			
			this.balanceMiles = this.balanceMiles - (noOfSeatUpgrades * 10000);
			this.seatUpgrades = this.seatUpgrades + noOfSeatUpgrades;
			return true;
		}
		if (this.getStatus() == "Green"
				&& this.getBalanceMiles() >= (noOfSeatUpgrades * 9000)) {			
			this.balanceMiles = this.balanceMiles - (noOfSeatUpgrades * 9000);
			this.seatUpgrades = this.seatUpgrades + noOfSeatUpgrades;
			return true;
		}
		if (this.getStatus() == "Blue"
				&& this.getBalanceMiles() >= (noOfSeatUpgrades * 8000)) {			
			this.balanceMiles = this.balanceMiles - (noOfSeatUpgrades * 8000);
			this.seatUpgrades = this.seatUpgrades + noOfSeatUpgrades;
			return true;
		}
		
		if (this.getStatus() == "Golden"
				&& this.getBalanceMiles() >= (noOfSeatUpgrades * 7000)) {			
			this.balanceMiles = this.balanceMiles - (noOfSeatUpgrades * 7000);
			this.seatUpgrades = this.seatUpgrades + noOfSeatUpgrades;
			return true;
		}
	    else {
			return false;
		}
	}
}
