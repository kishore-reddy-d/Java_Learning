package com.exe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
	public static void main(String[] args) throws IOException {
		
		InputStreamReader in = new InputStreamReader(System.in);
		
		BufferedReader buf = new BufferedReader(in);
		
		System.out.println("enter the number for factorial :");
		
		String s = buf.readLine();
		
		int k = Integer.parseInt(s);
		int factorial =1;
		
		
		for(int i=1; i<=k;i++) {
			
			factorial = factorial*i;
			
			
		}
		
		System.out.println("factorial is :"+factorial);
	}
	
	


}
