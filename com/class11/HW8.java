package com.class11;

import java.util.Scanner;

//Maximum and minimum number in the array
public class HW8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[8];
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		System.out.print("Please enter 8 integers: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		for (int i : arr) {
			if (i >= max) {
				max = i;
			}
			if (i < min) {
				min = i;
			}
		}
		System.out.println();
		System.out.println("The max number is: " + max + " and the min nummber is: " + min);

	}

}






