package com.example.demo.bean;

public class HuluClassUser {
	private String email;
	private String password;
	
	public HuluClassUser() {
		
	}
	
	public HuluClassUser(String email, String password){
		this.email=email;
		this.password=password;
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

	
}
