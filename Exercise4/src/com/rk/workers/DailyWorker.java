package com.rk.workers;

public class DailyWorker extends Worker{
	public void Pay(int hours) {
		setSalaryrate(10);
		System.out.println("Daily Worker get paid: " + (getSalaryrate() * hours));
	}
}