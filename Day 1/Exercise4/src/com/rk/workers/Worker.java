package com.rk.workers;

abstract public class Worker {
	private String name;
	private double salaryrate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalaryrate() {
		return salaryrate;
	}
	public void setSalaryrate(double salaryrate) {
		this.salaryrate = salaryrate;
	}
	abstract void Pay(int hours);
}
