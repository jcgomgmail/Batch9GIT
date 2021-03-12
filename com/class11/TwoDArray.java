package com.class11;

import java.util.Scanner;

/*
 * Create a 2D array where you will store the following values:
 *  Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
After storing values print the following:
Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.

Create a 2D array that first row will contain 4 names 
and second row will contain grades. 
Then your program should print name of the students that 
has A and B grade
 */
public class TwoDArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[][] a1 = {	{ "Mr", "Mrs", "Ms", "Miss" },
							{ "Smith", "Jordan", "Jackson", "Obama." }, 
						};
		int next = 0;
		for (int i = 0; i < 1; i++) {

			for (int j = 0; j < a1[i].length; j++) {

				do {
					System.out.print(a1[next][j]);
					next += 1;
					if((next==a1.length)&&(j<a1[i].length-1)) {
						System.out.print(", ");
					}else {
						System.out.print(" ");
					}
					
				} while (next < a1.length);	
				
				next=0;
			}			
		}
	}
}
