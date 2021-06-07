package com.rk.demo;

public class RunTock implements Runnable {
	
	Clock clock = new Clock();
	
	public RunTock(Clock clock) {
		this.clock = clock;
	}
	@Override
	public void run() {
		for(int i = 1; i<=60 ; i++) {
			clock.Tock(i);
		}
	}

}
