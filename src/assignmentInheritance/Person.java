package assignmentInheritance;

public class Person {

	private String accountNo;
	private String name;
	private double totalFunds;
	private int pin;
	private String onlineBankingPassword;

	public Person(String accountNo, String name, double totalFunds, int pin, String onlineBankingPassword) {
		this.accountNo = accountNo;
		this.name = name;
		this.onlineBankingPassword = onlineBankingPassword;
		this.totalFunds = totalFunds;
		this.pin = pin;

	}

	public String getAccountNo() {
		return accountNo;
	}

	public String getName() {
		return name;
	}

	public double getTotalFunds() {
		return totalFunds;
	}

	public int getPin() {
		return pin;
	}

	public String getOnlineBankingPassword() {
		return onlineBankingPassword;
	}

}
