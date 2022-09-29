package com.masai.bean;

public class ContactPerson {
	private int bid;
	private String name;
	private String mobile;
	
	public ContactPerson() {
		// TODO Auto-generated constructor stub
	}

	public ContactPerson(int bid, String name, String mobile) {
		super();
		this.bid = bid;
		this.name = name;
		this.mobile = mobile;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "ContactPerson [bid=" + bid + ", name=" + name + ", mobile=" + mobile + "]";
	}
	
	
}
