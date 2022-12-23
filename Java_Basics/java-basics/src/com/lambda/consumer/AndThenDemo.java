package com.lambda.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class AndThenDemo {
	public static void main(String[] args) {
		
	
	
	Consumer<List<Integer>> modify = list ->
	{
			for(int i=0;i<list.size();i++)
			{
				list.set(i , 2*list.get(i));
			}
	};
	
	Consumer<List<Integer>> displaylist= list ->list.stream().forEach(a -> System.out.println(a +" "));
	
	
	List<Integer> list= new ArrayList<Integer>();
	list.add(25);
	list.add(56);
	list.add(67);
	list.add(47);
	list.add(28);
	
	
	modify.andThen(displaylist).accept(list);
	
	}	

}
