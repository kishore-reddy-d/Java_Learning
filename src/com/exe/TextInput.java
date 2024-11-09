package com.exe;

import java.util.Scanner;

public class TextInput {
	public static void main(String[] args) {
		System.out.println("enter the text :");
		
		Scanner sc = new Scanner(System.in);
		
		 String txt= sc.nextLine();
		 
		 System.out.println("The text you entered is :"+txt);
		 sc.close();
		 
	}

}
