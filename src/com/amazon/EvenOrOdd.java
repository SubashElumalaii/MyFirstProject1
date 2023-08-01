package com.amazon;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Please  enter the number: ");
		int number=s.nextInt();
		if(number%2==0)
		{
			System.out.println(number+" is Even Number");
			
		}
		else
		{
			System.out.println(number+" is Odd number");
		}
		
		
	}

}
