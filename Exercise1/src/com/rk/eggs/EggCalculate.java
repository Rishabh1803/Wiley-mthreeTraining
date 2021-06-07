package com.rk.eggs;

public class EggCalculate {

	private int total;
	private EggNumber egg;

	public void setTotal(int total) {
		this.total = total;
	}
	public void displayEgg() {
		setEgg();
		System.out.format("We have %d gross, %d dozen and %d remaining eggs with us!",egg.getGross(),egg.getDozen(),egg.getRemaining());
	}
	private void setEgg() {
		egg = new EggNumber();
		int temp = total;
		egg.setGross(temp/144);
		temp = temp % 144;
		egg.setDozen(temp / 12);
		egg.setRemaining(temp % 12);
	}
}