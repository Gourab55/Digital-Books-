package mypractics;

import java.util.function.Consumer;

public class ConsumerEx {
	
	
	public static void main(String[] args) {
		
	  Consumer<String> name= (s) -> System.out.println("After operation "+s.toUpperCase());
	  name.accept(" my java programme");
	  

	}
}

		 		  