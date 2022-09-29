package com.masai.bean;

import java.sql.Time;

public class BusLink {
	private int bid;
	private String source;
	private String dest;
	private Time arrival;
	private Time dept;
	private int seat;
	
	public BusLink() {
		// TODO Auto-generated constructor stub
	}

	public BusLink(int bid, String source, String dest, Time arrival, Time dept, int seat) {
		super();
		this.bid = bid;
		this.source = source;
		this.dest = dest;
		this.arrival = arrival;
		this.dept = dept;
		this.seat = seat;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public Time getArrival() {
		return arrival;
	}

	public void setArrival(Time arrival) {
		this.arrival = arrival;
	}

	public Time getDept() {
		return dept;
	}

	public void setDept(Time dept) {
		this.dept = dept;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	@Override
	public String toString() {
		return "Bus_link [bid=" + bid + ", source=" + source + ", dest=" + dest + ", arrival=" + arrival + ", dept="
				+ dept + ", seat=" + seat + "]";
	}
	
	
}
