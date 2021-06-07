package com.rk.presentation;

import java.util.Scanner;

import com.rk.customexceptions.AgeCheckedException;
import com.rk.customexceptions.DuplicateNameException;
import com.rk.service.EmployeeManageImpl;

public class EmployeePresentationImplementation implements EmployeePresentation {
	
	static EmployeeManageImpl employee = new EmployeeManageImpl();
	static Scanner sc = new Scanner(System.in);
	@Override
	public void showMenu() {
		System.out.println("\nWelcome to the Employee Adding Program\n");
		System.out.println("1. Add an Employee into the database");
		System.out.println("2. Display all Employee from the database");
		System.out.println("3. Exit\n");
		System.out.println("----------------------------------------------");
		System.out.print("Enter Your Choice: ");
	}

	@Override
	public void perform(int choice) {
		switch(choice) {
		case 1: try {
				System.out.println("\nEnter Age and Name: ");
				int age = sc.nextInt();
				sc.nextLine();
				String name = sc.nextLine();
				employee.addEmployee(name,age);
			} catch (DuplicateNameException | AgeCheckedException e) {
				System.out.println(e);
			} 
			break;
		case 2: System.out.println();
				employee.displayAllEmployees();
				break;
		case 3: System.out.println("Thank you for using the Program!");
				System.out.println("Exiting...");
				sc.close();
				System.exit(0);
		}

	}

}
