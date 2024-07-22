package com.day4;

public class Stringbuffer {

	private static System system;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// class append
		
		StringBuffer sp = new StringBuffer("hello");
		
		sp.append ("oak");
		
				System.out.println(sp);
				//String builder insert() method 
				sp.insert(1,"oak");
				System.out.println(sp);
	//replace() method
				sp.replace(1,3,"oak");
				System.out.println(sp);
				//delete method()
				StringBuffer sp1 = new StringBuffer("hello");
				sp.delete (1,3);
				System.out.println(sp);
				//Stringbuffer and Stringbulider
				long StartTime= System.currentTimeMillis();
				StringBuffer sb =new StringBuffer("java");
				for(int i=0;i<10000;i++) {
					sb.append("Tpoint");
					
				}
				System.out.println("Time taken by Stringbuffer:"+ (System.currentTimeMillis()-StartTime) + "ms");
				StartTime= system.currentTimeMillis();
				StringBuffer sb2 =new StringBuffer("java");

				for(int i=0;i<10000;i++) {
					sb2.append("Tpoint");
					System.out.println("Time taken by Stringbulider:"+ (System.currentTimeMillis()-StartTime) + "ms");

					//contain()
			String name="what do you know about me ";
			System.out.println(name.contains("do you know"));
			System.out.println(  name.contains("about"));
				System.out.println(name.contains("hello"));	
}
				
				
	
	}
	}


