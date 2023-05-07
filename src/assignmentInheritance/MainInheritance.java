package assignmentInheritance;

import java.util.*;

public class MainInheritance {

	public static void main(String[] args) {

		Person person = new Person("123456", "Rini", 1000.00, 1234, "PASSWORD");
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the BANK");

		System.out.println("\n Enter banking type \n 1 - ATM Banking \n 2 - Online Banking");
		int bankingType = sc.nextInt();
		
		BankOperation bop=null;

		if (bankingType == 1) {
			
//Using parent class refernce variable to assign the child class object.
			 bop = new ATM(person.getTotalFunds(), person.getPin());
			
			
		//	 bop = new ATM(person.getTotalFunds(), person.getPin());
			 
			 System.out.println(" 1. Change Passowrd/PIN  2.Login with current Pin /Password: \n Enter your choice");
				int choice=sc.nextInt();
				if(choice==1)
				{
					 bop.changePinPassword();

				}
				else
				//{
					

			System.out.println("  \n " + " Account holder name  " + person.getName());
			System.out.println(" \n " + " Account No: " + person.getAccountNo());
			bop.performTransaction();
				//}
		} else if (bankingType == 2) {
			// Creating an object of parent class
			// with reference to child class
			 bop = new OnlineBanking(person.getTotalFunds(), person.getOnlineBankingPassword());

			// Login should be used here with crediatials
			 System.out.println(" 1. Change Passowrd  2.Login with current Pin /Password: \n Enter your choice");
				int choice=sc.nextInt();
				if(choice==1)
				{
					 bop.changePinPassword();

				}
				else

			System.out.println("  \n " + " Account holder name  " + person.getName());
			System.out.println(" \n " + " Account No: " + person.getAccountNo());
		
			bop.performTransaction();
		} else {
			System.out.println("Invalid Banking TYpe:select the correct type from the above menu");
		}

	}

}
