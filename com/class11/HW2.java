package com.class11;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] num = new int[3][4];
		System.out.println("Please enter 12 integer numbers: ");
		for (int x = 0; x < num.length; x++) {
			for (int y = 0; y < num[0].length; y++) {
				
				num[x][y] = input.nextInt();

			}
		}
		System.out.println();
		System.out.print("The even number are: ");
		for (int[] oL : num) {
			for (int pNum : oL) {
				if ((pNum % 2) == 0) {
					System.out.print(pNum + " ");
				}
			}

		}
	}
}
