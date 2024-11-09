package com.example;

public class Calculationn {
	
	public static void main(String[] args) { // testing git
		
		int A[][] = {{1,2},{3,4}};
		int B[][] = {{5,6,7,8},{9,10,11,12}};
		
		int C[][] = new int[2][4];
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				C[i][j] = 0;
				for (int k = 0; k < 2; k++) {
				C[i][j]	= C[i][j]+A[i][k]*B[k][j];
				
				}
			}
		}
		
		System.out.println("result of matrix multiplication is :");
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				
				System.out.print(C[i][j]+" ");
				
			}
			System.out.println();
		}
				
	}

}
