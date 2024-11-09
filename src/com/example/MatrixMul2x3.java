package com.example;

public class MatrixMul2x3 {
	
	public static void main(String[] args) {
		
		int A[][] = {
				
				{1,2,3,4},
				{3,4,5,6},
				
		};
		
		int B[][] = {
				{5,6,7},
				{8,9,10},
				{11,12,13},
				{14,15,16}
		};
		
		int C[][] = new int[2][3];
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				C[i][j] = 0;
				for (int k = 0; k < 4; k++) {
					C[i][j] += A[i][k]*B[k][j];
					
				}
			}
		}
		
		System.out.println("result is :");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(C[i][j]+" ");
				
			}
			System.out.println();
		}
		
	}

}
