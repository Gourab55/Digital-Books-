package com.basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class MathutilsTest {
	
	private Mathutils mathutils;
	@BeforeEach
	void initEach() {
		mathutils=new Mathutils();
	}
		
	

	@Nested
	class AdTtest{
		 @Test
		  void TestAddtwoPsitivenumbers() {
			 
			  assertEquals(30,mathutils.add(10,20),"Add method returning the sum of two integers");
			  }
		
		 @Test
		  void TestAddonePsitiveandonenNegativeumbers() {
			 
			  assertEquals(10,mathutils.add(-10,20),"Add method returning the sum of two integers");
			  }
		 @Test
		  void TestAddTwoNegativeeumbers() {
			 
			  assertEquals(-30,mathutils.add(-10,-20),"Add method returning the sum of two integers");
			  }
		 @Test
		 void testMultiply() {
			 assertAll(
					 () -> assertEquals(0,mathutils.mult(10, 0)),
					 () -> assertEquals(100,mathutils.mult(10, 10)),
					 () -> assertEquals(10,mathutils.mult(10, 1))
					 
					 );
		 }
		 
		 @Test
		 void 
		 
		 
		
	}
	
	
	
	/* @Test
	void test() {
	 System.out.println("This test case run");
	}
  @Test
  void TestAdd() {
	  Mathutils mathutils=new Mathutils();
	  int expected=20;
	  int actual=mathutils.add(10, 10);
	  assertEquals(expected, actual);
	  }
  @Test
  void TestSub() {
	  Mathutils mathutils=new Mathutils();
	  int expected=0;
	  int actual=mathutils.sub(10, 10);
	  assertEquals(expected, actual);
	  }
  @Test
  void TestMult() {
	  Mathutils mathutils=new Mathutils();
	  int expected=100;
	  int actual=mathutils.mult(10, 10);
	  assertEquals(expected, actual);
	  }
  @Test
  void TestDiv() {
	  Mathutils mathutils=new Mathutils();
	  int expected=1;
	  int actual=mathutils.div(10, 10);
	  assertEquals(expected, actual);
	  }
  
   //assertEquals(expected,actuals)
  //assertarrayEquals(expected array,actuals array)
  //assertIterableEquals(expected array, actuals array)
  
  @Test
  void TestAtreaOfCircle() {
	  Mathutils mathutils=new Mathutils();
	  int expected=1;
	  double actual=mathutils.computrCirclearea(5.0);
	  assertEquals(expected, actual);
	  
  } */
  
  
  }	