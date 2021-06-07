package com.rk.threaddisplay;

public class ThreadDataDisplay extends Thread {
	static
	{
		System.out.println("ID\tName\t\tAlive\tState\tPriority");
	}
	public void run() {
		for(int i = 1;i<=5;i++) {
			System.out.println(this.getId() + "\t" + this.getName() + "\t" + this.isAlive() + "\t" + this.getState() + "\t" + this.getPriority());
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadDataDisplay thread1 = new ThreadDataDisplay();
		ThreadDataDisplay thread2 = new ThreadDataDisplay();
		ThreadDataDisplay thread3 = new ThreadDataDisplay();
		ThreadDataDisplay thread4 = new ThreadDataDisplay();
		thread1.start();
		thread1.join();
		thread2.start();
		thread2.join();
		thread3.start();
		thread3.join();
		thread4.start();
		thread4.join();
	}
}