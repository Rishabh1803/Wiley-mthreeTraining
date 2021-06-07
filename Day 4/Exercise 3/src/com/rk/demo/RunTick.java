package com.rk.demo;

public class RunTick implements Runnable {
	
	Clock clock = new Clock();
	
	public RunTick(Clock clock) {
		this.clock = clock;
	}
	@Override
	public void run() {
		for(int i = 1; i<=60 ; i++) {
			clock.Tick(i);
		}
	}

}
