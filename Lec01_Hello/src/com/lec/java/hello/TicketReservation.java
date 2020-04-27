package com.lec.java.hello;

public class TicketReservation {
	int uid;
	int movield;
	int seatld;
	String regDate;
	
	public TicketReservation() {}

	public TicketReservation(int uid, int movield, int seatld, String regDate) {
		super();
		this.uid = uid;
		this.movield = movield;
		this.seatld = seatld;
		this.regDate = regDate;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getMovield() {
		return movield;
	}

	public void setMovield(int movield) {
		this.movield = movield;
	}

	public int getSeatld() {
		return seatld;
	}

	public void setSeatld(int seatld) {
		this.seatld = seatld;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	
	
	
	

}
