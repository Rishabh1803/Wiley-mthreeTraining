package com.rk.demo;

public class RunTack implements Runnable {
	
	Clock clock = new Clock();
	
	public RunTack(Clock clock) {
		this.clock = clock;
	}
	@Override
	public void run() {
		for(int i = 1; i<=60 ; i++) {
			clock.Tack(i);
		}
	}

}
