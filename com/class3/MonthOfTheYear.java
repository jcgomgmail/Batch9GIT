package com.class3;

import java.util.Scanner;

public class MonthOfTheYear {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter month number: ");
		int month = input.nextInt();
		if (month > 0 && month <= 12) {
			if (month == 1)
				System.out.println("The month is January");
			else if (month == 2)
				System.out.println("The month is February");
			else if (month == 3)
				System.out.println("The month is March");
			else if (month == 4)
				System.out.println("The month is April");
			else if (month == 5)
				System.out.println("The month is May");
			else if (month == 6)
				System.out.println("The month is Jun");
			else if (month == 7)
				System.out.println("The month is July");
			else if (month == 8)
				System.out.println("The month is August");
			else if (month == 9)
				System.out.println("The month is September");
			else if (month == 10)
				System.out.println("The month is October");
			else if (month == 11)
				System.out.println("The month is November");
			else
				System.out.println("December");
		} else
			System.out.println("invalid number");

	}
}
