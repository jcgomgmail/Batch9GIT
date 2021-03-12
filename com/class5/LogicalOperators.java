package com.class5;

import java.util.Scanner;

/*
 * 
Task


Prompt the user to enter person heights in inches. Person should be classified as one of the following:
short (under 60 inch)
medium(between 60 -72 inch)
tall (over 72 inch)


Write a program that will print whether it is a weekend or weekday. 
If any day from 1-5 → output “It is a weekday”, anyday from 6-7 → output “It is a weekend”, 
any other day → output “Invalid day”
 */

public class LogicalOperators {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1, n2, n3, largest;
		System.out.println("Enter first number: ");
		n1 = input.nextInt();
		System.out.println("Enter second number: ");
		n2=input.nextInt();
		System.out.println("Enter third number: ");
		n3=input.nextInt();
		
		if(n1>n2) {
			largest=n1;
		}else {
			largest=n2;
		}
		if(n3>largest) {
			largest=n3;
		}
		
		
		
		
		System.out.println("the larges number is: "+largest);
		
	}
}
