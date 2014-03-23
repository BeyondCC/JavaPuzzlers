package com.cc.ch4.LoopyPuzzlers;

public class Looper28 {

	public static void main(String[] args) {
		double i = Double.POSITIVE_INFINITY;
		
		while(i == i+1) // left equal to the right
			;
		System.out.println("end");
	}

}
