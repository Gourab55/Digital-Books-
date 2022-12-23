package com.functional.Assignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.functional.interfaces.User;

public class Courses {
	
	int course_id;
	String course_name;
	String course_teacher;
	Integer duration;
	Integer course_fess;
	

public Courses(int course_id, String course_name, String course_teacher, Integer duration, Integer course_fess) {
		
		this.course_id = course_id;
		this.course_name = course_name;
		this.course_teacher = course_teacher;
		this.duration = duration;
		this.course_fess = course_fess;
	}


public int getCourse_id() {
	return course_id;
}


public String getCourse_name() {
	return course_name;
}


public String getCourse_teacher() {
	return course_teacher;
}


public Integer getDuration() {
	return duration;
}


public Integer getCourse_fess() {
	return course_fess;
}


@Override
public String toString() {
	return "Courses [course_id=" + course_id + ", course_name=" + course_name + ", course_teacher=" + course_teacher
			+ ", duration=" + duration + ", course_fess=" + course_fess + "]";
}
public static int comparebyFess(Courses a,Courses b){
	return a.getCourse_fess().compareTo(b.getCourse_fess());
	
	
}
private static List process(List<Courses> users, Predicate<Courses> predicate) {
	List<Courses> res= new ArrayList<>();
	for(Courses user1: users)
		if(predicate.test(user1))
			res.add(user1);
	return res;
	
	
  }
   public static void main(String[] args) {
	   
	   List<Courses> course= new ArrayList<>();
	   course.add(new Courses(100,"JEE-main","Animesh",2,15000));
	   course.add(new Courses(100,"AIPMT","Adarsh",10,65000));
	   course.add(new Courses(100,"Banking","Nikhil",56,6000));
	   course.add(new Courses(100,"Railway","Tusar",12,10000));
	   
	   List Seniors=process(course,(Courses c)-> c.getCourse_name().equals("Railway") );
	   System.out.println(Seniors);

		//getCourse_fess().stream().sorted().collect(Collectors.toList())
	   
	   
   


	   
	   


 }
}
//private static List process(List<Courses> cr1, Predicate<Courses> predicate) {
//List<Courses> res= new ArrayList<>();
//for(Courses cr2: cr1)
//	if(predicate.test(cr2))
//		res.add(cr2);
//return res;
//
//	  }
//   cr1.stream().sorted().map(x -> x.getCourse_fess()).forEachOrdered(System.out::pritln);
//   
//   cr1.stream().sorted(Comparator<T>.class).
//   
//   
//   // List<Courses> cr2= .stream().sorted().collect(Collectors.toList());
//   	   
	
//}
//Collections.sort(course,(cr1,cr2) -> cr1.getCourse_fess().compareTo(cr2.getCourse_fess()));
//System.out.println(course);
//Collections.sort(course,(cr1,cr2) -> cr2.getCourse_fess().compareTo(cr1.getCourse_fess()));
//System.out.println(course);
//Collections.sort(course,(cr1,cr2) -> cr1.getDuration().compareTo(cr2.getDuration()));
//System.out.println(course);
//


