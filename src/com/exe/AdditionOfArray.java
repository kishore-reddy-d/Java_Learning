package com.exe;

import java.util.Scanner;

public class AdditionOfArray {
	public static void main(String[] args) {
		int matrixA[][]= new int[2][2];
		int matrixB[][]= new int[2][2];
		
		int sum[][]= new int[2][2];
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				
				System.out.println("enter value in matrix A :");
				
				matrixA[i][j] = sc.nextInt();
				
			}
			
		}	
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				
				System.out.println("enter the values in matrixB :");
				matrixB[i][j] = sc.nextInt();
				
			}
			
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				sum[i][j]=matrixA[i][j]+matrixB[i][j];
				
			}
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				
				System.out.println("sum of two matrix is :"+sum[i][j]);
				
			}
	
		}
		
	}
}
