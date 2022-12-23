package com.functionalInterfaces;

import java.util.ArrayList;
import java.util.List;

public class User {
	String name;
	String role;
	User(String n, String r)
	{
		name=n;
		role=r;
	}
	public String getName() {
		return name;
	}
	
	public String getRole() {
		return role;
	}
	
	
@Override
	public String toString() {
		return "User [name=" + name + ", role=" + role + "]";
	}
public static void main(String[] args) {
	
	List<User> users= new ArrayList<>();
    
	users.add(new User("Gourab","Junor-dev")); 
	users.add(new User("Partho","Junor-dev")); 
	users.add(new User("Ansu","senior-dev")); 
	users.add(new User("Gourab","senior-dev")); 
	List seniors=process((User u) -