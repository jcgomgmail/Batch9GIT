package com.class11;

import java.util.Scanner;

/*
 * Write a program to swap 2 numbers without a temporary variable
 */
public class HW5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter two integers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		System.out.println("You entered: " + num1 + " " + num2);
		num1 += num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.print("The numbers swapped are: " + num1 + " " + num2);
	}

}
