package bankImpl;

import bank.CreditInterest;
import bank.DepositAcc;

public class FDAcc implements CreditInterest, DepositAcc {

	@Override
	public void calcInt() {
		System.out.println("Interest calculated at interest rate: "+(interestPercentage-1));

	}

	@Override
	public void createAcc() {
		System.out.println("Account has been created!");
		System.out.println(fixed + " Deposit Account: "+fixedDepositAccount);

	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw from FD Account not permitted!");

	}

	@Override
	public void deposit() {
		System.out.println("Deposit was made on time!");

	}

	@Override
	public void getBalance() {
		System.out.println("Balance not updated!\nWill be updated once FD is mature!");

	}

	@Override
	public void addMonthlyInt() {
		System.out.println("Not Applicable!");

	}

	@Override
	public void addHalfYrlyInt() {
		System.out.println("Not Applicable");

	}

	@Override
	public void addAnnualInt() {
		System.out.println("Annual Interest added successfully!");

	}

}
