package com.exe;

import java.util.Iterator;
import java.util.Scanner;

public class MultiplyMatrix {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A[][] = new int [2][2];
		int B[][] = new int [2][3];
		int C[][] = new int [2][3];
		
		System.out.println("enter a number in to matrix A :");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				
				A[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				
				B[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				
				
				
			}
			
		}
	}

}
