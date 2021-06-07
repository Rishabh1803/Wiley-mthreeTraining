package com.rk.client;

import java.util.Scanner;

import com.rk.presentation.EmployeePresentationImplementation;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		EmployeePresentationImplementation employee = new EmployeePresentationImplementation();
		while(true) {
			employee.showMenu();
			int choice = sc.nextInt();
			sc.nextLine();
			employee.perform(choice);
			System.out.println("Enter Y to continue or press any other key to exit: ");
			char ch = (sc.next()).charAt(0);
			if(ch == 'Y' || ch == 'y' )
				continue;
			else {
				employee.perform(3);
			}
		}
	}
}
