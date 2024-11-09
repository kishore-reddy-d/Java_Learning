package com.example;

public class MulMatrix2 {
	
	public static void main(String[] args) {
		
		int A[][] = {{1,2},{3,4}};
		int B[][] = {{5,6,7},{8,9,10}};
		
		int result[][] = new int[2][3];
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				result[i][j] = 0;
				for (int j2 = 0; j2 < 2; j2++) {
					result[i][j] = result[i][j]+A[i][j2]*B[j2][j];
					
				}
				
			}
		}
		
		System.out.println("result matric is :");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(result[i][j]+" ");
				
			}
			System.out.println();
		}
		
	}

}
