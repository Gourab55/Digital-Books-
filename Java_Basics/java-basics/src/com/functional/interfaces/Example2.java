package com.functional.interfaces;

interface Square{
	void square(int n);
	default void print()
	{
		System.out.println("default method is executed");
	}
}
public class Example2 implements Square{

	@Override
	public void square(int n) {
		System.out.println("The sqare of the number"+n+" is "+n *n );
		
	}
	public static void main(String[] args) 
	{
		Example2 e2= new Example2();
		e2.square(23);
		e2.print();
		
	}

}
