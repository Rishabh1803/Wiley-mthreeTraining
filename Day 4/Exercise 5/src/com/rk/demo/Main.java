package com.rk.demo;

public class Main {
	public static void main(String[] args) {
		Hen hen = new Hen();
		Thread henThread = new Thread(new RunHen(hen));
		Thread ownerThread = new Thread(new RunOwner(hen));
		
		henThread.start();
		ownerThread.start();
	}
}
