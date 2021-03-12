package com.class11;

import java.util.Scanner;

/*
 * Create a 2D array or integer type and store numbers in 3 rows and 3 columns. 
 * Print the sum of all numbers.
 */
public class HW1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] tDArray = new int[3][3];
		int sum = 0;
		System.out.println("Enter 9 Integer Numbers: ");
		for (int x = 0; x < tDArray.length; x++) {
			for (int y = 0; y < tDArray[0].length; y++) {
				
				tDArray[x][y] = input.nextInt();
				sum += tDArray[x][y];
			}
		}
		System.out.println("The sum of the array numbers is: " + sum);
	}
}

/*
 * public static void main(String[] args) {
 * 
 * int[][] array= { {1,2,4}, {10,20,30}, {100,200,300} };
 * 
 * int sum=0; for(int r=0; r<array.length; r++) { for(int c=0;
 * c<array[r].length; c++) { sum+=array[r][c]; }
 * 
 * } System.out.println("The sum of all numbers is "+sum);
 * 
 * }
 * 
 * }
 */
/*
 * public static void main(String[] args) { int c=0; int d=0; int[][] num = {
 * {1, 2, 3}, {4, 5, 6}, {7, 8, 9}, };
 * 
 * for (int a=0; a<num.length; a++) { c+=a;
 * 
 * for(int b=0; b<num[a].length; b++) { d+=b;
 * 
 * 
 * }
 * 
 * } int sum=c+d; System.out.print(sum); }
 * 
 * }
 */
