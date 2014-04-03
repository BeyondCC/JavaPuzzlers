package com.cc.ch8.ClassierPuzzlers;

import java.util.Arrays;

class ImportDuty {
	public static void main(String[] args) {
		printArgs(1, 2, 3, 4, 5);
	}

	static void printArgs(Object... args) {
		
		//if only write toString(args)
		//the compiler will find the  override toString()in Object,but the arg
		// is not the Object[]
		System.out.println(Arrays.toString(args));
	}
}