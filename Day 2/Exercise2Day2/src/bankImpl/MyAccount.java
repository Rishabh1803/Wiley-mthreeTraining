package bankImpl;

public class MyAccount {

	public static void main(String[] args) {
		SavingsAcc savings = new SavingsAcc();
		FDAcc fd = new FDAcc();
		PersonalLoanAcc personal = new PersonalLoanAcc();
		HousingLoanAcc housing = new HousingLoanAcc();
		savings.createAcc();
		fd.createAcc();
		personal.createAcc();
		housing.createAcc();
	}

}
