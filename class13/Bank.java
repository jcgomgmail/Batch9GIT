package class13;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		// input = new Scanner(System.in);
		clientMenu();
	}

	public static void clientMenu() {
		Account bankAccount = new Account();
		Scanner input = new Scanner(System.in);
		System.out.println("Do you have an account with us - Yes or No? ");
		String answer = input.next();
		if (answer.equalsIgnoreCase("yes")) {
			System.out.println("******* Extsting Client *******");
			String name = getName();
			String password = getPassword();
			bankAccount.viewAccount(name, password);
		} else if (answer.equalsIgnoreCase("no")) {
			System.out.println("Would you like to open a new account? ");
			answer = input.next();
			if (answer.equalsIgnoreCase("yes")) {
				createNewClient();
			} else {
				System.out.println("Goodbye!!");
			}
		}
	}

	public static void createNewClient() {
		Account bankAccount = new Account();
		System.out.println("******* New Client *******");
		String name = getName();
		String password = getPassword();
		double balance = getBalance();
		bankAccount.createAccount(name, password, balance);
		clientMenu();
	}

	public static String getName() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String iName = input.next();
		return iName;
	}

	public static String getPassword() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your password: ");
		String pWord = input.next();
		return pWord;
	}

	public static double getBalance() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the amount to adjust new balance: ");
		double iBalance = input.nextDouble();
		return iBalance;

	}
}
