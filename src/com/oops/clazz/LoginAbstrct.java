package com.oops.clazz;

public abstract class LoginAbstrct {
	
	// not 100 % abstract class becuz of having abstract and concrete methods
	public abstract void validate();
	public abstract void dbConnection();
	
	public void normalMethod() {
		System.out.println("this is non abtsract method");
	}
	
	public abstract int add(int a, int b);

}
