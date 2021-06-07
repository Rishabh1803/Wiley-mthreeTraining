package bankImpl;

import bank.DebitInterest;
import bank.LoanAcc;

public class PersonalLoanAcc implements LoanAcc, DebitInterest {

	@Override
	public void createAcc() {
		System.out.println("Account has been created!");
		System.out.println(personalLoan + " Account: "+personalLoanAccount);

	}

	@Override
	public void calcInt() {
		System.out.println("Interest calculated at interest rate: "+(interestPercentage-3));

	}

	@Override
	public void deductMonthlyInt() {
		System.out.println("Monthly Interest deducted!");

	}

	@Override
	public void deductHalfYrlyInt() {
		System.out.println("Half Yearly Interest deducted!");

	}

	@Override
	public void deductAnnualInt() {
		System.out.println("Annual Interest Deducted!");

	}

	@Override
	public void repayPrincipal() {
		System.out.println("Principal amount paid completely!");

	}

	@Override
	public void payInterest() {
		System.out.println("Interest paid successfully!");

	}

	@Override
	public void payPartialPrincipal() {
		System.out.println("Principal amount paid partially!");

	}

}
