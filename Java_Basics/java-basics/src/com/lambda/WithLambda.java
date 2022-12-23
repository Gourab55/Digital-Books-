package com.lambda;

interface printname1{
	public void print();
}
public class WithLambda implements printname1  {
	public static void main(String[] args) 
	{
		String name="Haffiz";
		
		printname1 myname=()->{
			System.out.println("My name is"+name);
		};
		myname.print();
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	/*@Override
	public void print() {
		// TODO Auto-generated method stub
		
	} */

}
