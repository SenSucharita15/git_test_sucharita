package assignmentInheritance;

import java.util.*;

//import assignmentInheritance.OnlineBanking.override;

public class OnlineBanking extends BankOperation {

	private String password;

	public OnlineBanking(double balance, String password) {
		super(balance);
		this.password = password;

	}

	@Override
	public void performTransaction() {
		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter the password");
		// String enteredPassword = sc.nextLine();
		boolean flag = false;
		System.out.println("Enter the password");
		String enteredPassword = sc.nextLine();
		if (enteredPassword.equals(password)) {
			// System.out.println("1. Deposit\n 2. withdraw \n 3. View Balance");
			// int choice = sc.nextInt();

			while (!flag) {

				System.out.println("\n 1. Deposit\n 2. withdraw \n 3. View Balance\n 4. Exit \n ");
				int choice = sc.nextInt();

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
		} else {
			System.out.println(" Invalid Passowrd try again");

		}

		System.out.println("THANK YOU");
	}
}
