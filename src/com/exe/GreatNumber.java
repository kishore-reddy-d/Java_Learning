package com.exe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreatNumber {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader inputi= new InputStreamReader(System.in);
		BufferedReader buf= new BufferedReader(inputi);
		
		System.out.println("enter the 1st number :");
		
		int i= Integer.parseInt(buf.readLine());
		
		System.out.println("enter 2nd number :");
		
		int j= Integer.parseInt(buf.readLine());
		
		System.out.println("enter 3rd number :");
		int k = Integer.parseInt(buf.readLine());
		
		int greatest;
		
		if(i>=j && i>=k) {
			greatest=i;
		} else if(j>=k && j>=i) {
			greatest = j;
		} else {
			greatest=k;
		}
		System.out.println("greatest is :" +greatest);
		
		
		
	}

}
