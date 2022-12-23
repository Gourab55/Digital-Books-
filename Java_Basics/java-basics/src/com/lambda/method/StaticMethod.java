package com.lambda.method;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class User{
	private String name;
	private Integer age;
	public User(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}
	
	public static class StaticMethod{
		
		//static method to  compare by age
		
		public static int comparebyAge(User a, User b) {
			return a.getAge().compareTo(b.getAge());
		}
		public static int comparebyName(User a, User b) {
			return a.getName().compareTo(b.getName());
		}
	}	
	public static void main(String[] args) {
		
		List<User> userlist= new ArrayList<>();
		userlist.add(new User("Gourab",23));
		userlist.add(new User("Haffiz",54));
		userlist.add(new User("Naveen",65));
		userlist.add(new User("Goutam",66));
		
		Collections.sort(userlist,StaticMethod::comparebyName);
		System.out.println("Sort by age is: ");
		
		userlist.stream().map(x -> x.getName()).forEach(System.out::println);




		
	}
	}
 