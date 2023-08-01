package com.amazon;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		// Find the number positive/negative
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number:");
		
		int num=s.nextInt();		
		if(num>0) 
		{
			System.out.println("The Given number is Positive");
		}
		else if(num<0)
		{
		  System.out.println("The Given number is Negative");	
		}
		else {
			System.out.println("Zero is Neutral Number");
		}
		

	}

}
