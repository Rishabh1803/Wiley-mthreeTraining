package com.rk.student;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		int studentCount = sc.nextInt();
		Standard standard = new Standard(studentCount);
		System.out.println("Enter details of all students\n");
		for(int i = 0 ; i<standard.getTotal(); i++) {
			System.out.println("Enter name and marks in English, Maths and Science: ");
			sc.nextLine();
			String name = sc.nextLine();
			int marksE = sc.nextInt();
			int marksM = sc.nextInt();
			int marksS = sc.nextInt();
			standard.setParticularStudent(i,name,marksE,marksM,marksS);
		}
		System.out.println("Details of All the students in the increasing order of roll no: ");
		for(int i = 0 ; i<standard.getTotal(); i++)
			standard.displayStudent(i);
		int percentHigh = standard.highestPercentage();
		System.out.print("Student with Highest Percentage: ");
		standard.displayStudent(percentHigh);
		int mathHigh = standard.highestMath();
		System.out.print("Student with Highest Marks in Math: ");
		standard.displayStudent(mathHigh);
		sc.close();
	}
}