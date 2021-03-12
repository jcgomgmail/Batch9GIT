package review;

import java.util.Scanner;

public class ReviewClass1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[4]; // here the array of 4 spaces is created
		System.out.print("Please enter 4 integers: ");
		for (int i = 0; i < arr.length; i++) { 
			// here we use "i" to set the numbers entered in keyboard to the array 
			arr[i] = input.nextInt();
		}
		for (int print : arr) {
			System.out.print(print);
			//here we use the enhanced for to print
		}
	}
}
