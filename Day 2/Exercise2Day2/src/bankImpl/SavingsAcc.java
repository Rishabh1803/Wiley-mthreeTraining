package bankImpl;

import bank.CreditInterest;
import bank.DepositAcc;

public class SavingsAcc implements DepositAcc, CreditInterest {

	@Override
	public void createAcc() {
		System.out.println("Account has been created!");
		System.out.println(savings + " Account: " + savingsAccount);
	}

	@Override
	public void calcInt() {
		System.out.println("Interest calculated at interest rate: "+interestPercentage);

	}

	@Override
	public void addMonthlyInt() {
		System.out.println("Monthly amount added!");

	}

	@Override
	public void addHalfYrlyInt() {
		System.out.println("Interest calculated at half yearly interval!");

	}

	@Override
	public void addAnnualInt() {
		System.out.println("Interest calculated at annually!");

	}

	@Override
	public void withdraw() {
		System.out.println("Withdrawn has been made!");

	}

	@Override
	public void deposit() {
		System.out.println("A deposit has been made!");

	}

	@Override
	public void getBalance() {
		System.out.println("Balance was fetched!\nCheck Balance");

	}

}
