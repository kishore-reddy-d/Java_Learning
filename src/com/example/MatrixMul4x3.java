package com.example;

public class MatrixMul4x3 {
	public static void main(String[] args) {
		
		int A[][] = {{1,2},{3,4},{5,6},{7,8}};
		int B[][] = {{9,10,11},{12,13,14}};
		
		int C[][] = new int[4][3];
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				
				C[i][j] = 0;
				
				for (int k = 0; k < 2; k++) {
					
					C[i][j] += A[i][k]*B[k][j];
					
					
				}
			}
		}
		
		System.out.println("here is the result :");
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(C[i][j]+" ");
			}
			System.out.println();
		}
	}

}
