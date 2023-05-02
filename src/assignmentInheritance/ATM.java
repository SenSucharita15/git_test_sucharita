package assignmentInheritance;
//java.lang.override;

import java.util.*;

public class ATM extends BankOperation {
	private int pin;
	// private int count;

	public ATM(double balance, int pin) {
		super(balance);
		this.pin = pin;
	}

	@Override

	public void performTransaction() {
		Scanner sc = new Scanner(System.in);
		boolean flag = false;

		// System.out.println("Enter the pin");
		// int enteredPin = sc.nextInt();

		int count = 0;
		// if (enteredPin == pin && count<3) {
		while (count < 3) {
			System.out.println("Enter the pin");
			int enteredPin = sc.nextInt();
			if (enteredPin == pin) {

				System.out.println(" You have logged in successfully\n");
				break;
			} else {
				count++;
				System.out.println("Invalid Pin Try again.Attempts remaining  :" + (3 - count));
			}
		}
		if (count == 3) {
			System.out.println("Thank You ");
			System.out.println(" Account Locked");
			return;
		
			//break;
		}

		// System.out.println("1. Deposit\n 2. withdraw \n 3. View Balance \n 4. exit");

		while (!flag) {

			System.out.println("\n 1. Deposit\n 2. withdraw \n 3. View Balance \n 4. exit\n ");
			int choice = sc.nextInt();
			// System.out.println(" want to continue Enter your choice");
			switch (choice) {

			case 1:
				System.out.println("Enter the amount to be deposited");
				double depositAmount = sc.nextDouble();
				deposit(depositAmount);
				System.out.println(" \n want to continue Enter your choice");
				break;

			case 2:
				System.out.println("Enter the amount to withdraw");
				double withdrawAmount = sc.nextDouble();
				withdraw(withdrawAmount);
				System.out.println(" \n want to continue Enter your choice");
				break;

			case 3:
				viewBalance();
				System.out.println(" \n want to continue Enter your choice");
				break;

			default:
				System.out.println("Invalid choice.Enter a valid choice from the above option");
				System.out.println(" \n want to continue Enter your choice");
				break;

			case 4:
				flag = true;
				break;
			}

		}


		System.out.println("Thank You ");
	}

}
