package com.cc.ch2.expresspuuzlers;

public class DosEquis {

	
	//mixed type computation
	//constant 0 consider as char so the first print is char x 'X'
	//while the second is int i ,while x is char so the x cast to int
	//so the result is ASCII 88
	//while add the final modifier, the i is constant 0,so the result is 'X'
	public static void main(String[] args) {
		char x = 'X';
		//final int i = 0;
		int i = 0;
		
		System.out.println(true ? x : 0);
		System.out.println(false ? i : x);
	}
}
