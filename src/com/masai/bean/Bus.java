package com.masai.bean;

public class Bus {
	private int bid;
	private String name;
	private String type;
	
	public Bus() {
		// TODO Auto-generated constructor stub
	}

	public Bus(int bid, String name, String type) {
		super();
		this.bid = bid;
		this.name = name;
		this.type = type;
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

	@Override
	public String toString() {
		return "Bus [bid=" + bid + ", name=" + name + ", type=" + type + "]";
	}
	
	
	
}
