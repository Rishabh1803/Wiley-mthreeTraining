package com.rk.matrix;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter order of matrix: ");
		int n = sc.nextInt();
		Matrix m1 = new Matrix(n);
		Matrix m2 = new Matrix(n);
		System.out.println("Enter elements of first matrix: ");
		m1.setMatrix(sc);
		System.out.println("Enter elements of second matrix: ");
		m2.setMatrix(sc);
		Matrix sum = m1.add(m2);
		m1.displayMatrix("First Matrix: ");
		m2.displayMatrix("\nSecond Matrix: ");
		sum.displayMatrix("\nResultant Matrix: ");
	}
}
