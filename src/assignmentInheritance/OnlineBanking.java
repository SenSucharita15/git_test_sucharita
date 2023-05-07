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

		boolean flag = false;
		int count = 0;
		// if (enteredPin == pin && count<3) {
		while (count < 3) {
			System.out.println("Enter the password");
			String enteredPassword = sc.nextLine();
			if (enteredPassword.equals(password)) {

				System.out.println(" You have logged in successfully\n");
				break;
			} else {
				// System.out.println("Invalid Password Try again .Attempts remaining :" + (3 -
				// count));
				count++;
				System.out.println("Invalid Password Try again .Attempts remaining  :" + (3 - count));

			}
		}
		if (count == 3) {
			System.out.println(" \n \n  Thank You ");
			System.out.println(" Account Locked");
			return;

			// break;
		}

		while (!flag) {

			System.out.println("\n 1. Deposit (interac/cheque)\n 2. Transfer  \n 3. View Balance\n 4. Exit \n ");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter deposit by  cash/cheque: ");
			
				
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

		System.out.println("THANK YOU");
	}

	@Override

	public void changePinPassword() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your current password");
		String currentPassword = sc.nextLine();
		boolean flag=false;
		while(!flag)
		{
		if (currentPassword.equals(password)) {
			System.out.println("Enter the new password:");
			String newPassword = sc.nextLine();
			if (!newPassword.equals(password) && newPassword.length() >= 8 && ! newPassword.matches(".*[&$@].*")) {
				password = newPassword;
				System.out.println("Password updated successfully ");
				break;
			} else {
				System.out.println(
						"Password is invali must be 8 characters long , should not  have &,$,@ and different from old password ");
			}
		} else {
			System.out.println("Incorrect password");
			flag=false;
			break;
		}
		}
	}
}
