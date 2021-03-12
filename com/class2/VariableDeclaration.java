package com.class2;

import java.util.Scanner;

public class VariableDeclaration {

	public static void main(String[] args) {
		Scanner nInput = new Scanner(System.in);
		int sum;
		System.out.print("Value of x: ");
		int x = nInput.nextInt();
		System.out.print("Value of y: ");
		int y = nInput.nextInt();

		sum = x + y;
		System.out.println("Sum Result is = " + sum);
		String test = "I Want to check ";
		test+="if i can add just like this ";
		test += x;
		System.out.println(test);
		
	}

}
