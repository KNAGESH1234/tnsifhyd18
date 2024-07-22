package com.day3;

public class Conditonalstatement {

	public static void main(String[] args) {
		int a =9;
		// if satement 
		if (a>0);{
			System.out.println(a+"is postive");
		}
		//if flase satement
		if(a%2==0) {
			System.out.println(a+"is even Number");
		}
		else {
			System.out.println(a+"is odd Number");
		}
		// if -else-if statement
		int marks=56;
		if(marks>=90) {
		System.out.println("frist class pass");
		}
		else if (marks>=70) {
			System.out.println("second class pass");
		}
		else if (marks>=50) {
	System.out.println(" third class pass");
		}
		else {
			System.out.println("fail,prepare well next time");
		}
		
		// TODO Auto-generated method stub
//nested - if statement
		int age=23;
		if(age>=23) {
			System.out.println("eligiable to vote");
			if(age>=21) {
				System.out.println("you can have alchohol");
			}
			
		}
		else {
			System.out.println("not eligibleto vote");
		}
		
		int num1=10;
		int num2=15;
		
		int key=5;
		switch (key) {
		case 1: 
			System.out.println("Addition num1+num2="+(num1+num2));
			break;
		case 2: 
			System.out.println("Subtraction num1-num2="+(num1-num2));
			break;
		case 3: 
			System.out.println("Multiplication num1*num2="+(num1*num2));
			break;
		case 4: 
			System.out.println("Division num1/num2="+(num1/num2));
			break;
		case 5: 
			System.out.println("Modulus num1%num2="+(num1%num2));
			break;
		default:
			System.out.println("Invalid Key "+key);
		}
		

		
		
		
		
		
	}

}
