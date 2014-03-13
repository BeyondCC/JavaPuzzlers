package com.cc.ch2.expresspuuzlers;

public class Tweedledee10 {

	public static void main(String[] args) {
		Object x = "buy";
		
		String i = "Java Puzzlers";
		
		x = x + i;  // it is legal
		
		System.out.println(x);
		
		String s = "sadf";
		
		//	x += i;
		// it is illegal ,because the left oprand is object ,it hasnot the += operator
	}

}
