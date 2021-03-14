package test2;

import java.util.Scanner;

import class13.Account;

public class Bank2 {
	public void main(String[] args){
        Scanner input=new Scanner(System.in);

        Account bankAccount = new Account();

        System.out.println("Do you have an account with us - Yes or No? " );
        String answer=input.next();
        if(answer.equals("Yes")){
            System.out.println("******* Extsting Client *******");
            String name = getName();
            String password = getPassword();
      //          bankAccount.vewAccount(name,password);
        }else{
                System.out.println("******* New Client *******");
                String name = getName();
                String password = getPassword();
                double balance = getBalance();
                bankAccount.createAccount(name,password,balance);
        }
    }
    public String getName(){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String iName= input.next();
        return iName;
    }
    public String getPassword(){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your new password: ");
        String pWord= input.next();
        return pWord;
    }
    public double getBalance(){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the amount to adjust new balance: ");
        double iBalance= input.nextDouble();
        return iBalance;

    }
}
