package com.day5;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.List;

public class StreamExample1 {
public static void main(String[] args) {
	List<Integer>numbers =Array.asList(2,4,1,5,7,23,400);
	
	System.out.println(numbers);
	
	List<Integer> evennum= numbers.stream()
			                      .filter(n->n%2==0)
		           	              .collect(Collections.toList());
	
	
	System.out.println(evennum);

}



}

