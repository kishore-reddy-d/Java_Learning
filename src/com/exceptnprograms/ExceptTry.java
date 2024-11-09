package com.exceptnprograms;

public class ExceptTry {
	
	private void calculate() {
		
		int number1 = 10;
		int number2 = 0;
	
	try { 
		int number3 = number1/number2;
		System.out.println(number3);
		
	} catch(Exception e) {
		System.out.println("can not devide by 0");
		
	}
	}
}
