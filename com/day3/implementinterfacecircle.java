package com.day3;

public class implementinterfacecircle implements interfaceshape {
	private double radius; 
	public implementinterfacecircle(double radius) {
		this.radius= radius;
	}
		public void area() {
			System.out.println("area of circle ="+(Math.PI*radius*radius));
		}
			
			public void perimeter1() {
			
				System.out.println("perimeter1 of circle ="+(Math.PI*2*radius));
						
			
		// TODO Auto-generated constructor stub
	
		
	}
			@Override
			public void perimeter() {
				// TODO Auto-generated method stub
				
			}
		
	}


