package com.class3;

import java.util.Scanner;

public class HomeWork {

	public static boolean isPositive(int num) {
		if (num > 0)
			return (true);
		else
			return (false);
	}

	public static boolean isEven(int num) {
		if ((num % 2) == 0)
			return (true);
		else
			return (false);

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		do {
			System.out.print("Enter a number different than 0: ");
			num = input.nextInt();
		} while (num == 0);

		boolean isPositive = isPositive(num);
		boolean even = isEven(num);
		
		if(isPositive)
			System.out.println("number "+num+" is positive");
		else
			System.out.println("number "+num+" is negative");
		if (even)
			System.out.println("number "+num+" is even");
		else
			System.out.println("number "+num+" is odd");
		
		
	}

}
