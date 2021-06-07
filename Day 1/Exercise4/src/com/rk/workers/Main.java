package com.rk.workers;

public class Main {

	public static void main(String[] args) {
		Worker salaried = new SalariedWorker();
		Worker daily = new DailyWorker();
		salaried.Pay(45);
		daily.Pay(45);
	}

}
