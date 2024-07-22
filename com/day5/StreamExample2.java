package com.day5;
import java.util.Arrays;
import java.util.List;

public class StreamExample2 {
	public static void main(String[] args) {
		List<String>words=Arrays.asList("Stream","API","DateAPI","TimeAPI");
		int totallength=words.stream()
	             .mapToInt(String::length)
	             .sum();

System.out.println("TotalLength="+totallength);
}

}
	
	
	


