package com.lambda.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class AcceptDemo {
	public static void main(String[] args) {
		
		//how to create a consumer
		Consumer<Integer> display= a -> System.out.println(a);
		
		//implementing display method using accept
		display.accept(345);
		
		//
		Consumer<List<Integer>>
		displayList= list -> list.stream().forEach(a -> System.out.println(a +" "));
		
		
		
		
		List<Integer> list= new ArrayList<>();
		list.add(45);
		list.add(36);
		list.add(93);
		;
		displayList.accept(list);
	}

}
