package com.exe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOrOdd {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader io= new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(io);
		
		System.out.println("enter the number :");
		
		int i= Integer.parseInt(buff.readLine());
		
		if(i%2==0) {
			System.out.println(i+ " is an even number");
		} else {
			System.out.println(i+" is a odd number");
		}
		
		
		
	}

}
