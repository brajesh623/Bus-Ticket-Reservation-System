package com.masai.bean;

import java.sql.Time;

public class Bus {
	private int bid;
	private String name;
	private String type;
	private String source;
	private String dest;
	private Time arrival;
	private Time dept;
	private int seat;
	
	public Bus() {
		// TODO Auto-generated constructor stub
	}

	public Bus(int bid, String name, String type, String source, String dest, Time arrival, Time dept,
			int seat) {
		super();
		this.bid = bid;
		this.name = name;
		this.type = type;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
		return "Bus [bid=" + bid + ", name=" + name + ", type=" + type + ", source=" + source
				+ ", dest=" + dest + ", arrival=" + arrival + ", dept=" + dept + ", seat=" + seat + "]";
	}
}
