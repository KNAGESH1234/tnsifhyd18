package com.day5;

public class LambdaExpression {
	public static void main(String[] args) {
		Drawabble d1=()->{
			System.out.println("i am drawing");
			
		};
		d1.draw();
		Drawaabble2 d2= (a)->{
			return"i am animal "+a;
			
		};
		System.out.println(d2.draw("Tiger"));
		
Addable a = (num1,num2)->{
	return(num1+num2);
	
};
System.out.println("addtion result="+a.add(12, 32));
	System.out.println("addition result="+a.add(12, 32));			
				
				
	}

}
