package com.cc.ch2.expresspuuzlers;

public class Tweedledum9 {

	/**
	 * compound assignment operators += 
	 * E1 op= E2
	 * E1 = (T) (E1 op E2) where T is the type of E1
	 * @param args
	 */
	public static void main(String[] args) {

		short x = 2;
		int i = 3;
		// this equal x = (short) (x + i)
		x += i;
		
	//	x = x + i;  this is wrong  x + i is int ,int cast to short is narrow cast
	}

}
