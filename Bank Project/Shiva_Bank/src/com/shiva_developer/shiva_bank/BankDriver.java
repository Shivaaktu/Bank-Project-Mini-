package com.shiva_developer.shiva_bank;

import java.util.Scanner;

public class BankDriver {
	
	static Scanner sc=new Scanner(System.in);
	static double balance=0;

	public static void main(String[] args) {
		
		int option=0;
		System.out.println("Welcome to Shiva's Bank");
		while(option!=4) {
			System.out.println("Press 1 for check balance");
			System.out.println("Press 2 for deposit money");
			System.out.println("Press 3 for widraw money");
			System.out.println("Press 4 for exit");
			System.out.println("Enter Enter option form above");
			option=sc.nextInt();
			
			
			switch (option) {
			case 1: 
				checkBalance();
				break;
			case 2:
				deposit();
				break;
			case 3:
				widraw();
				break;
			case 4:
				exit();
				break;
			default:
				//throw new IllegalArgumentException("Unexpected value: " + option);
				System.out.println("Invalid option try again");
				break;
			}

		}

	}
	
	public static void checkBalance() {
		System.out.println("Your currebt balance is Rs"+balance+"\n\n");
	}
	
	public static void deposit() {
		System.out.println("enter the amount to dposite ");
		double amount=sc.nextDouble();
		balance+=amount;
		System.out.println("Deposited successfully");
		System.out.println("Your current balance is ");
		checkBalance();
	}
	
	public static void widraw() {
		System.out.println("Enter amout to widraw ");
		double amount=sc.nextDouble();
		if(amount>balance) {
			System.out.println("Lack of balance");
		}
		else {
			balance-=amount;
			System.out.println(amount+"rupees has ben debited from your account. ");
		}
		checkBalance();
	}
	
	public static void exit() {
		System.out.println("Thanks for visting shiva's bank. Have a great day");
	}
	
}
