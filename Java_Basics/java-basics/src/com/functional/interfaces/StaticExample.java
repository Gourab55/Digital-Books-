package com.functional.interfaces;

interface SayName{
	
	static void say() {
		System.out.println("Hello My name is Nishant.");
	}
	void Age(int age);
}


public class StaticExample implements SayName {

	@Override
	public void Age(int age) {
		System.out.println("Age is "+age);
	}
	
	public static void main(String[] args) {
		
		SayName.say();
		StaticExample s1=new StaticExample();
		s1.Age(45);
		
		
		
	}

}
