package com.rk.demo;

public class ClockMain {
	public static void main(String[] args) {
		Clock clock = new Clock();
		Thread tick = new Thread(new RunTick(clock),"Tick");
		Thread tack = new Thread(new RunTack(clock),"Tack");
		Thread tock = new Thread(new RunTock(clock),"Tock");
		
		tick.start();
		tack.start();
		tock.start();
	}
}
