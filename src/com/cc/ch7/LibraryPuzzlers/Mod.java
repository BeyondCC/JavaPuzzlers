package com.cc.ch7.LibraryPuzzlers;

public class Mod {

	public static void main(String[] args) {
		final int MODULUS = 3;
		int[] histogram = new int[MODULUS];
		// Iterate over all ints (Idiom from Puzzle 26)
		int i = Integer.MIN_VALUE;
		
		System.out.println((-0) % 3);
		do {
			System.out.println(i);
			System.out.println(-i);
			System.out.println(Math.abs(i) % 3);
			//for Math.abs(x) ,if x is Integer.MIN_VALUE, the result is MIN_VALUE
			//for the % operator, the first operand is negative, the result is negative
			histogram[Math.abs(i) % MODULUS]++;
		} while (i++ != Integer.MAX_VALUE);
		for (int j = 0; j < MODULUS; j++)
			System.out.println(histogram[j] + " ");
	}

}
