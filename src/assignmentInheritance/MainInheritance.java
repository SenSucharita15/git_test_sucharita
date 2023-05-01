package assignmentInheritance;

import java.util.*;

public class MainInheritance {

	public static void main(String[] args) {
		
		Person person = new Person("123456", "Rini", 1000.00, 1234, "PASSWORD");
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the BANK");

		System.out.println("\n Enter banking type \n 1 - ATM Banking \n 2 - Online Banking");
		int bankingType = sc.nextInt();

		if (bankingType == 1) {
			// ATM atm = new ATM(person.getTotalFunds(), person.getPin());
			// BankOperation bop = new BankOperation();
			// bop.performTransaction();
//Using parent class refernce variable to assign the child class object.
			BankOperation bop1 = new ATM(person.getTotalFunds(), person.getPin());

			System.out.println("  \n " + " Account holder name  " + person.getName());
			System.out.println(" \n " + " Account No: " + person.getAccountNo());
			bop1.performTransaction();
		} else if (bankingType == 2) {
			// Creating an object of parent class
	        // with reference to child class
	BankOperation bop2 = new OnlineBanking(person.getTotalFunds(), person.getOnlineBankingPassword());

	//Login should be used here with crediatials
			
			System.out.println("  \n " + " Account holder name  " + person.getName());
			System.out.println(" \n " + " Account No: " + person.getAccountNo());
			// OnlineBanking onlineBanking = new OnlineBanking(person.getTotalFunds(),
			// person.getOnlineBankingPassword());
			bop2.performTransaction();
		} else {
			System.out.println("Invalid Banking TYpe:select the correct type from the above menu");
		}

	}

}
