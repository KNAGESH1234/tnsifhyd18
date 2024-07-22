package com.day5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class Time_Date_APIExample {
public static void main(String[] args) {
	LocalDate date=LocalDate.now();
	System.out.println(date);
	
	LocalTime time=LocalTime.now();
	System.out.println(time);
	
	LocalDateTime datetime=LocalDateTime.now();
	System.out.println(datetime);

}
}
