package com.exe;

import java.util.Iterator;
import java.util.Scanner;

public class SumOfN {
	public static void main(String[] args) {
		
		int sum =0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number(n) :");
		int n = sc.nextInt();
		
		for (int i = 1; i <=n; i++) {
			sum =sum+i;
			
			
			
		}
		System.out.println("sum of n numbers :"+sum);
	}
}
