package com.example;

public class StudentConstuct {   //constructor injection
	
	int id;
	int age;
	String name;
	
	public StudentConstuct(int id, int age, String name) {
		this.id = id;
		this.age = age;
		this.name = name;
	}
	
	public void printStudentData() {
		System.out.println("id is "+id+" name is :"+name+" age is :"+age);
		
	}
	
}
