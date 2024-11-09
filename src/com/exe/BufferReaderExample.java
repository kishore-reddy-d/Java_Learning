package com.exe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderExample {
	public static void main(String[] args) {
		InputStreamReader inputtext= new InputStreamReader(System.in);
		BufferedReader buff= new BufferedReader(inputtext);
		
		String value= null;
		try {
			System.out.println("enter the string :");
			 value= buff.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			
		}	
		System.out.println("entered value is :"+value);
		
	}

}
