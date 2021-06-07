package com.rk.eggs;

import java.util.Scanner;

public class MainEgg {

	public static void main(String[] args) {
		EggCalculate egg = new EggCalculate();
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter the total number of eggs: ");
		egg.setTotal(sc.nextInt());
		egg.displayEgg();
		sc.close();
	}
}