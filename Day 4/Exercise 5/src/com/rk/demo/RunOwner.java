package com.rk.demo;

public class RunOwner implements Runnable {
	
	Hen hen = new Hen();
	
	public RunOwner(Hen hen) {
		super();
		this.hen = hen;
	}

	@Override
	public void run() {
		for(int i = 1; (i*2)<=100 ; i++) {
			hen.ownerGain(i);
		}
	}

}
