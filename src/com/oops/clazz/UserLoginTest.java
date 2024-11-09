package com.oops.clazz;

public class UserLoginTest {

	public static void main(String[] args) {
		
		LoginAbstrct obj = new LoginAbstrctImplementation();
		obj.dbConnection();
		obj.normalMethod();
		obj.validate();
		
		int xyz = obj.add(10, 20);
		
		System.out.println(xyz);
	}
}
