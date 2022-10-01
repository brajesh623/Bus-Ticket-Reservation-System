package com.masai.bean;

public class ContactPerson {
	private int cpid;
	private String name;
	private String mobile;
	
	public ContactPerson() {
		// TODO Auto-generated constructor stub
	}

	public ContactPerson(int cpid, String name, String mobile) {
		super();
		this.cpid = cpid;
		this.name = name;
		this.mobile = mobile;
	}

	public int getCpid() {
		return cpid;
	}

	public void setCpid(int cpid) {
		this.cpid = cpid;
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
		return "ContactPerson [cpid=" + cpid + ", name=" + name + ", mobile=" + mobile + "]";
	}
	
	
}
