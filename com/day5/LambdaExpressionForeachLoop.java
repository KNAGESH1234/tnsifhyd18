package com.day5;
import java.util.ArrayList;
import java.util.List;

import com.day4.stringexample;

public class LambdaExpressionForeachLoop {
public static void main(String[] args) {
	String[] names = {
			"rcb",
			"csk",
			"ck",
			"rr",
			"gt",
			
			
	};
	System.out.println("data printed normally without function");
		for(String name:names) {
			System.out.println(name);
		}
		System.out.println();
		List<String> data=new ArrayList<String>();
for(String name: names) {
	data.add(name);
	
}
System.out.println("data printed using lambda expresion");
data .forEach((n)->System.out.println(n));

}
}
