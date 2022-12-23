package com.lambda;

interface printname {
	public void print();
}

public class Withoutlambda {
	public static void main(String[] args) {
		//Without using lambda function , i want to implement without anonymous class
		String name = "Gourab";

		printname n1 = new printname() {

			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("My name is" + name);

			}

		};
		n1.print();

	}

}
