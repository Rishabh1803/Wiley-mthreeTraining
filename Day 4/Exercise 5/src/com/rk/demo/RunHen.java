package com.rk.demo;

public class RunHen implements Runnable {
	
	Hen hen = new Hen();
	
	public RunHen(Hen hen) {
		super();
		this.hen = hen;
	}
	@Override
	public void run() {
		for(int i = 1; (i*2)<=100 ; i++) {
			hen.henLayEgg(i);
		}
	}

}
