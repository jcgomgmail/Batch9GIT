package com.class6;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner scan;
		double price = 0, discount = 0, finalPrice = 0;
		String item;
		boolean sale = true;
		scan = new Scanner(System.in);
		System.out.println("What item are you looking for?");
		item = scan.nextLine();
		System.out.println("What is the price?");
		price = scan.nextDouble();
		if (!sale) {
			System.out.println("I am not going to shopping");
		} else {

				if (price <= 10.0) {
					discount = price * 0.5;

				} else if (price >= 10 && price <= 100) {
					discount = price * 0.1;

				} else if (price >= 100 && price <= 500) {
					discount = price * 0.2;

				} else {
					discount = price * 0.3;

				}

				finalPrice = price - discount;
				System.out.println("you are buying " + item + " with original price =" + price + " after buying "
						+ discount + " your final price is =" + finalPrice);

				if (finalPrice < 500) {
					System.out.println("I did not do crazy shopping");
				}

		
		}
	}
}

//Send a message to Carlos, Jay, Ty, Zack Sawyer
