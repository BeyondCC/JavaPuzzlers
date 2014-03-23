package com.cc.ch4.LoopyPuzzlers;

public class BriderOfLooper {

	public static void main(String[] args) {

		// double i = 0.0 / 0.0;
		double i = Double.NaN;
		
		//NAN is not equal to any float value, include itself
		//any expression contain NAN ,the result is NAN
		
		System.out.println(i - i == 0); //false
		
//		while (i != i)
//			System.out.println("it should be NAN!!");
		
		
	}

}
