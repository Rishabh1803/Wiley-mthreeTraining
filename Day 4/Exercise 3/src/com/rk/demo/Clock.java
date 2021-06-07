package com.rk.demo;

public class Clock {

	private static int flag = 0; 
	synchronized public void Tick(int i) {
		while(flag!=0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}
		System.out.print("Tick " + i);
		flag = 1;
		notifyAll();
	}
	synchronized public void Tack(int i) {
		while(flag!=1) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.print(" Tack "+i);
		flag = 2;
		notifyAll();
	}
	synchronized public void Tock(int i) {
		while(flag!=2) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(" Tock "+i);
		flag = 0;
		notifyAll();
	}
}