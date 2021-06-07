package com.rk.matrix;

import java.util.Scanner;

public class Matrix {
	private int[][] matrix;
	private int n;

	public Matrix(int n) {
		this.n = n;
		matrix = new int[n][n];
	}

	public void setMatrix(Scanner sc) {
		for(int i = 0; i<n ; i++) {
			for(int j = 0 ; j<n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
	}

	public void displayMatrix(String message) {
		System.out.println(message);
		for(int i = 0;i<matrix.length;i++) {
			for(int j = 0; j<matrix[0].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public Matrix add(Matrix m) {
		Matrix sum = new Matrix(n);
		for(int i = 0; i<matrix.length ; i++) {
			for(int j = 0 ; j<matrix[0].length; j++) {
				sum.matrix[i][j] = matrix[i][j] + m.matrix[i][j];
			}
		}
		return sum;
	}
}