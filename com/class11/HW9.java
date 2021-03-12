package com.class11;

import java.util.Arrays;
import java.util.Scanner;

public class HW9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] num = { 2,3,5,1,0,-1 }; 
		int max = num[0];
		int sMax = 0;
		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) {
				sMax = max;
				max = num[i];
			}
		}
		for (int i = 0; i < num.length; i++) {
			if ((sMax < num[i]) && (max > num[i])) {
				sMax = num[i];
			}
		}
		System.out.println("The second largest is " + sMax);
	}
}

/*
 * ***************** Fastest way ******************* 
 * Arrays.sort(num);
 * System.out.print("The secon max is: " + (num[num.length - 2])); }
 */
