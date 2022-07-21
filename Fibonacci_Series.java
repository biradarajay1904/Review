package com.Review.Program;

public class Fibonacci_Series {
	
	public static void main(String[] args) {
		System.out.println("Welcome To Fibonacci Series ");
	int n = 10, firstNum = 0, secondNum = 1;
	System.out.println(" Fibonacci Series " + n +" terms:");
	
	for (int i = 1; i <= n; i++) {
		System.out.println(firstNum + "");
		int nextTerm = firstNum + secondNum;
		firstNum = secondNum;
		secondNum = nextTerm;
		
	}
	
		
	}

}
