package com.oops.interfaccceee;

public class SettersExample {
	int id;
	int number;
	String name;
	String sname;
	
	public SettersExample(int j, String name) {
		this.id = j;
		this.sname = name;
		
	}
	
	public SettersExample(String name, int k) {
		this.name = name;
		this.number = k;
		
	}
	
	public void student() {
		System.out.println("student name is :"+sname+" student id is :"+id+" student number is  :"+number);
	}
	
}
