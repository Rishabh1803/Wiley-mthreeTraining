package com.rk.workers;

public class SalariedWorker extends Worker{
	public void Pay(int hours) {
		setSalaryrate(15);
		System.out.println("Salaried Worker gets paid: " + (getSalaryrate() * 40));
	}
}
