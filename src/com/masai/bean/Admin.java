package com.masai.bean;

public class Admin {
	private int cid;
	private String email;
	private String password;
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public Admin(int cid, String email, String password) {
		super();
		this.cid = cid;
		this.email = email;
		this.password = password;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [cid=" + cid + ", email=" + email + ", password=" + password + "]";
	}
	
	
}
