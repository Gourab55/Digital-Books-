package com.swag.entity;

public class User {
	
	private String username;
	private Long Salary;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Long getSalary() {
		return Salary;
	}
	public void setSalary(Long salary) {
		Salary = salary;
	}
	public User(String username, Long salary) {
		super();
		this.username = username;
		Salary = salary;
	}
	public User() {
		super();
	}
	
}
