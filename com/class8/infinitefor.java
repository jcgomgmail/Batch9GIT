package com.class8;

import java.util.Scanner;

public class infinitefor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		float payment = 0;

		System.out.println("Please enter the item you want to purchase: ");
		String item = input.next();

		System.out.println("Please enter the price of " + item + ": ");
		float price = input.nextFloat();

		for (;;) {
			System.out.println("Your balance is " + (price - payment) + " Please enter payment ");
			payment += input.nextFloat();

			if (payment > price) {

				System.out.println("Your change is: " + (payment - price));
				break;
			} else if (payment == price) {
				break;
			}

		}
		System.out.println("Thank you for shopping!");
	}
}
