package com.class11;

import java.util.Scanner;

public class DinamicSizeArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("How many numbers do you want to store and add? ");
		int size = input.nextInt();
		double numArray[] = new double[size];
		double ad1 = 0;

		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = input.nextDouble();

			ad1 += (numArray[i]);

		}

		System.out.println("The addition in = " + ad1);
		numArray = new double[9];
		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = i;
		}

		for (double i : numArray) {
			System.out.println(i);
		}
	}

}
