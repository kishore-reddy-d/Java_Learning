package com.example;

public class StudentConstructTest {
	
	public static void main(String[] args) {
		StudentSetterInj obj = new StudentSetterInj();
		obj.setId(10);
		obj.setName("kishore");
		int i = obj.getId();
		String s = obj.getName();
		
		System.out.println("id is :"+i+"string is :"+s);
		
	}

}
