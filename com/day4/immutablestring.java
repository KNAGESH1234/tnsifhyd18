package com.day4;

public class immutablestring {

	public static void main(String[] args) {
		String s="ramu";
		s.concat("sita");
		s=s.concat("sita");
		System.out.println(s);
		//by using equals() method
		String s1="ran";
		String s2="ran";
		String s3= new String("rana");
		String s4 ="charan";
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
		//by using ==operater
		String s5="ran";
		String s6="ran";
		String s7= new String("rana");
		System.out.println(s5==s6);
		System.out.println(s6==s7);
		//compareTo()method
     System.out.println(s5.compareTo(s6));
     System.out.println(s6.compareTo(s7));
     System.out.println(s7.compareTo(s5));
		
			// TODO Auto-generated method stub

	}

}
