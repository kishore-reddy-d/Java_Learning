package com.example;

import com.exe.TestA;

public class TestB extends TestA{
	
	public static void main(String[] args) {
		
		TestA obj = new TestA();
		
		System.out.println(obj.a);
		obj.m1();
		
		TestB bb = new TestB();
		bb.m3();
		
	}	
	
}
