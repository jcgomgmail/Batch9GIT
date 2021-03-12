package com.class4;

/*
 * Task

Write a program to store a boolean value of whether user has diploma or not. 
If user has a diploma, you should say congratulations, otherwise program should suggest to get a degree. 
Then if user has a degree, program should check a gpa score. 
If gpa score is higher or equals to 3.5 → output should say “You are eligible for scholarship”, otherwise → “You should have studied harder” .

Create a Java program and store values of mortgage rate and mortgage price. 
First, program should check if rate is higher than 4.5 user will not buy a house,
otherwise user will consider buying. 
Once user decides to buy a house, if price of the house is larger than 200000 than user will take a loan, 
otherwise user will pay cash.
 */
import java.util.Scanner;

public class nestedIf {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String diplomaAnswer;
		boolean answer = false;
		do {
			
			System.out.print("Does user has diploma? ");
			diplomaAnswer = input.next();
			if ((diplomaAnswer.equals("yes")) || (diplomaAnswer.equals("no")))
				answer = true;
			else
				System.out.println("Please enter Yes or No");

		} while (answer == false);
		

		if (diplomaAnswer.equals("yes")) {
		
			System.out.println("Congratulations!!");
			System.out.print("Please enter your GPA: ");
			float gpa = input.nextFloat();
			
			if (gpa > 3.5) {
				System.out.println("You are elegible for scolarship!");

			} else
				System.out.println("You should have studied harder!");

		} else
			System.out.println("You should get a degree!");
		
	}

}
