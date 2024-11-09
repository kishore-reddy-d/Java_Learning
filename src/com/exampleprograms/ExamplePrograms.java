package com.exampleprograms;

import java.util.Arrays;

public class ExamplePrograms {
	
public static void main(String[] args) {
	int A[][] = {{1,2,3,4},{2,3,4,5}};
	int B[][] = {{1,2,3,4},{1,2,3,4}};
	
	System.out.println("check :"+Arrays.deepEquals(A, B));
	}
}
