package com.masai.bean;

public class Booking {
	private int bkid;
	private int cid;
	private int bid;
	
	public Booking() {
		// TODO Auto-generated constructor stub
	}

	public Booking(int bkid,int cid, int bid) {
		super();
		this.bkid = bkid;
		this.cid = cid;
		this.bid = bid;
	}

	public int getBkid() {
		return bkid;
	}

	public void setBkid(int bkid) {
		this.bkid = bkid;
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
		return "Booking [bkid=" + bkid + ", cid=" + cid + ", bid=" + bid + "]";
	}

	
	
}
