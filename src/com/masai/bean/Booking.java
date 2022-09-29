package com.masai.bean;

public class Booking {
	private int cid;
	private int bid;
	
	public Booking() {
		// TODO Auto-generated constructor stub
	}

	public Booking(int cid, int bid) {
		super();
		this.cid = cid;
		this.bid = bid;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	@Override
	public String toString() {
		return "Booking [cid=" + cid + ", bid=" + bid + "]";
	}
	
	
}
