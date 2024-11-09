package com.example;

public class MulMatrix3x2 {
	
	public static void main(String[] args) {
		
		int A[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int B[][] = {{10,11},{12,13},{14,15}};
		int C[][] = new int[3][2];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				C[i][j] = 0;
				
				for (int k = 0; k < 3; k++) {
					C[i][j]  = C[i][j]+A[i][k]*B[k][j];
					
				}
			}
			
		}
		System.out.println("here is the result of multiplication :");
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				
				System.out.print(C[i][j]+" ");
								
			}
			System.out.println();
		}
	}

}
