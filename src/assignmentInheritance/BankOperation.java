package assignmentInheritance;

import java.util.*;

public class BankOperation {

	private double balance;
//	String name;

	public BankOperation(double balance) {
		this.balance = balance;

	}

//	public BankOperation() {
//		// TODO Auto-generated constructor stub
//	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance = balance - amount;
			System.out.println("Withdraw successful.Balance:" + balance);
		} else {
			System.out.println("Invalid amount or not sufficient balance");
		}

	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance = amount + balance;
			System.out.println("Deposit successful.Balance:" + balance);
		}

		else

		{
			System.out.println("Invalid amount or not sufficient balance");
		}

	}

	public void viewBalance() {
		System.out.println("  Balance:" + balance);
	}

	public void performTransaction() {
		System.out.println("Welcome to the Bank: operations available:1. ATM  2.Online Banking");
	}
}
