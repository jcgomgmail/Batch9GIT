package com.class11;

import java.util.Scanner;

/*
 * Create a 2D array or integer type where you will store 
 * integer values in 3 rows and 4 columns. 
 * 
 * Develop a program which will calculate 
 * the sum of  even and odd numbers for that array.
 */
public class HW3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int eSum=0,oSum=0;
		int[][] nArray=new int[3][4];
		System.out.println("Please enter 12 integers: ");
		for (int i=0;i<nArray.length;i++) {
			for(int j=0;j<nArray[0].length;j++) {
				nArray[i][j]=input.nextInt();
			}	
		}
		for(int[] printArray:nArray) {
			for(int num:printArray) {
				if((num%2)==0) {
					eSum+=num;
				}else {
					oSum+=num;
				}
			}
		}
	System.out.println("The sum of odd numbers is: "+ oSum);
	System.out.println("The sum of even numbers is: "+ eSum);
	}
}
