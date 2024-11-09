package com.exe;

import java.util.Iterator;
import java.util.Scanner;

public class SubstractionMatrix {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int matrixA[][] = new int[2][2];
		int matrixB[][] = new int[2][2];
		
		int sub[][] = new int[2][2];
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				
				System.out.println("enter the values one by one in matrix A :");
				matrixA[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println("enter the values one by one in matrix B :");
				matrixB[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				sub[i][j] = matrixA[i][j] - matrixB[i][j];
				
				System.out.println("sub of matrix :"+sub[i][j]);
				
			}
		
		}
		
	}

}
