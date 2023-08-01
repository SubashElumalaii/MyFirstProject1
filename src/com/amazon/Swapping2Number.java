package com.amazon;

public class Swapping2Number {

	public static void main(String[] args) {
		// Question:Swapping2Number using 3rd variable
		
		
		int x=20;
		int y=40;
		int temp;
		temp=x;
		x=y;
		y=temp;
		System.out.println(x+" is the current x value");
		System.out.println(y+" is the current y value");
		//---------------------------------------------------//
		//without using 3rd variable
		int a=30;
		int b=50;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" is the current a value");
		System.out.println(b+" is the current b value");
		

	}

}
