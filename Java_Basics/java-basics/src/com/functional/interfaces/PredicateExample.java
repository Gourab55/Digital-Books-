package com.functional.interfaces;

import java.util.function.Predicate;

public class PredicateExample {
	
	public static Predicate<String> haslengthof10= new Predicate<String>() {

		@Override
		public boolean test(String t) {
			// TODO Auto-generated method stub
			return t.length() <10;
		}
	};
		public static void predicate_or(){
			Predicate<String> ContainsLetterA = p -> p.contains("A");
			String s1="dfgpple";
			boolean res1=haslengthof10.or(ContainsLetterA).test(s1);
			System.out.println(res1);
					
		} 
	
	
	
	public static void main(String[] args) {
		
		// Creating Predicate
		Predicate<Integer> isAdult = i -> (i>18);
		
		//calling the Predicate method
		System.out.println(isAdult.test(8));
		
		
		Predicate<Integer> NotAadult = i -> (i>18);
		
		Predicate<Integer> isretired = i -> (i>60);
		
		boolean res= isAdult.and(isretired).test(45);
		System.out.println(res);
		
		System.out.println(haslengthof10.test("babunajatik"));
		
		predicate_or();
		
		
		
	}

} 