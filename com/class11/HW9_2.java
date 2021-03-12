package com.class11;

import java.util.Scanner;

public class HW9_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] num = new int[6];
		int temp = 0;
		System.out.println("Please enter "+num.length+" integers: ");
		for(int i=0;i<num.length;i++) {
			num[i] = input.nextInt();
		}
		for (int i = 0; i < (num.length - 1); i++) {			
			if (num[i] > num[i + 1]) {
				temp = num[i];
				num[i] = num[i + 1];
				num[i + 1] = temp;
				i = 0;
			}
		}
		System.out.print("The second largest is: " + num[num.length - 2]);
	}
}
