package com.class8;

import java.util.Scanner;

public class loops {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int even = 0, odd = 0, num1 = 0, num2 = 0;
		do {
			System.out.print("Enter start number and end number: ");
			num1 = input.nextInt();
			num2 = input.nextInt();
		} while (num1 > num2);

		for (int i = num1; i <= num2; i++) {
			if ((i % 2) == 0) {
				even += i;
			} else {
				odd += i;
			}
		}
		System.out.println("The addition of even number is; " + even);
		System.out.println("The addition of odd numbers is: " + odd);
		
		System.out.println();
		System.out.println("***************************************** End of first task *********************************************");
		System.out.println();

		float payment = 0;

		System.out.println("Please enter the item you want to purchase: ");
		String item = input.next();

		System.out.println("Please enter the price of " + item + ": ");
		float price = input.nextFloat();

		do {
			System.out.println("Your balance is " + (price - payment) + " Please enter payment ");
			payment += input.nextFloat();

			if (payment > price) {

				System.out.println("Your change is: " + (payment - price));
				break;
			}

		} while (payment != price);
		System.out.println("Thank you for shopping!");
	}
}
