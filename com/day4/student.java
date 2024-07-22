package com.day4;

public class student {
	public static void main(String[] args) {
		arraofobject s1[]=new arraofobject[5];
		
		s1[0]=new arraofobject(5, 6, "ram");
		s1[1]=new arraofobject(2, 3, "ramu");
		s1[2]=new arraofobject(5, 9, "ramkrishna");
		s1[3]=new arraofobject(4, 8, "ramcharan");
		s1[4]=new arraofobject(4, 8, "ravi");
		
		for (int i=0 ;i<s1.length;i++) {
			System.out.println(s1[i].a +" "+s1[i].b + " "+s1[i].c);
		}
			}}
