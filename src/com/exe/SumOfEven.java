package com.exe;

import java.util.Scanner;

public class SumOfEven {
	public static void main(String[] args) {
		int sum = 0;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the value n :");
		int n= sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			if (i % 2 == 0) {
				
				sum =  sum + i;
			}
		}
		
		System.out.println("sum of even numbers in n is :"+sum);
		sc.close();

	}

}
