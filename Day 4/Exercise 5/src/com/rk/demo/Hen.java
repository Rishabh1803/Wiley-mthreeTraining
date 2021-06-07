package com.rk.demo;

public class Hen {

	private static boolean flag = true; 
	synchronized public void ownerGain(int i) {
		if(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}
		System.out.println("Owner gained Rs " + (i*2));
		flag = true;
		notify();
	}
	synchronized public void henLayEgg(int i) {
		while(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Hen Laid the Egg - " + i);
		flag = false;
		notify();
	}
}