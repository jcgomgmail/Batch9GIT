package com.class2;

import java.util.Scanner;

public class Variables {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int age;
		char grade;

		System.out.println("First name: ");
		String firstName = in.next();
		System.out.println("Last name: ");
		String lastName = in.next();
		System.out.println("City: ");
		String city = in.next();
		System.out.println("State: ");
		String state = in.next();
		System.out.println("age: ");
		age = in.nextInt();
		grade = 'A';

		lastName += " Aponasenko";
		System.out.println("Our records indicate that you are : " + firstName + " " + lastName);
		System.out.println("you live in "+" "+city+", "+state);
		System.out.println("your age is" + " " + age);
		System.out.println("Plesae sellect 'y' if its correct or 'n' if wrong");
		String option = in.next();
		if (option.equals("y"))
			System.out.println("Your grade is " + grade);

		else if(option.equals("n")) 
			System.out.println("Not Found");
			
		else 
			System.out.println("wrong answer");

	}

}
