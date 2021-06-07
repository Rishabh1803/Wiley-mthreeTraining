package bankImpl;

import bank.DebitInterest;
import bank.LoanAcc;

public class HousingLoanAcc implements DebitInterest, LoanAcc {

	@Override
	public void calcInt() {
		System.out.println("Interest calculated at interest rate: "+(interestPercentage-0.5));

	}

	@Override
	public void createAcc() {
		System.out.println("Account has been created!");
		System.out.println(housingLoan + " Account: "+housingLoanAccount);

	}

	@Override
	public void repayPrincipal() {
		System.out.println("Complete Principal Amount successfully Paid!");

	}

	@Override
	public void payInterest() {
		System.out.println("Interest successfully paid!");

	}

	@Override
	public void payPartialPrincipal() {
		System.out.println("Partial Principal amount paid!");

	}

	@Override
	public void deductMonthlyInt() {
		System.out.println("Monthly Installment Deducted");

	}

	@Override
	public void deductHalfYrlyInt() {
		System.out.println("Half Yearly Installment Deducted");

	}

	@Override
	public void deductAnnualInt() {
		System.out.println("Annual Installment Deducted");

	}

}
