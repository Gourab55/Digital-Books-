package com.functional.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class User 
{
	String name;
	String role;
	
	User(String n,String r){
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
	users.add(new User("Gourab", "Senior-Dev"));
	users.add(new User("Haffiz", "Junor-Dev"));
	users.add(new User("stithi", "Junior-Dev"));
	users.add(new User("satya", "Senior-Dev"));
	users.add(new User("laxmi", "Senior-Dev"));
	List Seniors=process(users,(User u)-> u.getRole().equals("Senior-Dev"));
	System.out.println(Seniors);
}

private static List process(List<User> users, Predicate<User> predicate) {
	List<User> res= new ArrayList<>();
	for(User user1: users)
		if(predicate.test(user1))
			res.add(user1);
	return res;
	
	
  }

}
