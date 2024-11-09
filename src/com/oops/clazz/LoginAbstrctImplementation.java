package com.oops.clazz;

public class LoginAbstrctImplementation extends LoginAbstrct{

	@Override
	public void validate() {
		System.out.println("This is impl of validate");
	}

	@Override
	public void dbConnection() {
		System.out.println("This is implmof db connect");
	}

	@Override
	public int add(int a, int b) {
		int c = a+b;
		return c;
	}

}
