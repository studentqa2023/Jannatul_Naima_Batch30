package com.practice;

public class Animal 
{
	int a;
	int b;
			
	
	
	public Animal (int x, int y) {
		this.a=x;
		System.out.println(x+y);
		System.out.println(x<y);
		System.out.println(x>y);
		System.out.println(x=y);
		
		
		System.out.println("practice constructor");
	}
	public static void main(String[] args) {
		Animal obj = new Animal (10,20);
	}
	
	
}
