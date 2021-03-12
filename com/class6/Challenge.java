package com.class6;

import java.util.Scanner;

public class Challenge {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your country: ");
		String country = input.next();
		String language;
		switch (country.toUpperCase()) {

		case "COLOMBIA":
			language = "SPANISH";
			break;
		case "RUSSIA":
			language = "RUSSIAN";
			break;
		case "USA":
			language = "ENGLISH";
			break;
		default:
			language = " an unknown langage ";
			break;
		}
		System.out.println("You speak " + language);

	}

}
