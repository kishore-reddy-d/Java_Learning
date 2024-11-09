package com.exe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumbersOneToTen {
	public static void main(String[] args) throws IOException {
		
		int i;
		InputStreamReader inReader = new InputStreamReader(System.in);
		BufferedReader bufReader = new BufferedReader(inReader);
		
		System.out.println("enter the number");
		
		int count = Integer.parseInt(bufReader.readLine());
		
		for(i=1;i<=count;i++) {
			System.out.println(i);
			
		}
		
	}

}
