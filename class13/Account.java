package class13;

public class Account {
	// static String Type;
	static int aNumber;
	static String aPassword;
	static String userName;
	static double aBalance;
	static boolean isLoggedIn = false;
	static boolean isCreated = false;

	public void createAccount(String name, String password, double balance) {
		if (!isCreated) {
			Account.userName = name;
			Account.aPassword = password;
			int random = (int) (Math.random() * 500 + 100);
			Account.aNumber = random;
			Account.aBalance = balance;
			Account.isCreated = true;
			Account.isLoggedIn = true;

		}

	}

	public void viewAccount(String name, String password) {
		if ((Account.userName.equalsIgnoreCase(name)) && (Account.aPassword.equalsIgnoreCase(password))) {
			System.out.println("******* View Account *******");
			System.out.println("Your name is: " + userName);
			System.out.println("your account number is: " + aNumber);
			System.out.println("your balance is: " + aBalance);

		} else {
			isLoggedIn = false;
			System.out.println("Please enter valid credentials");
		}
	}

}
