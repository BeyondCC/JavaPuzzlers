package com.cc.ch2.expresspuuzlers;

import java.math.BigDecimal;
import java.util.LinkedList;

import javax.naming.BinaryRefAddr;

public class ExpressionPuzzlers {

	public static void main(String[] args) {

//		testPuzzle5();
//		testPuzzle4();
		testPuzzle3();
//		testPuzzle1();
		testPuzzle2();
	
		
		if('a' < 3){
			System.out.println("gha");
		}else
			System.out.println("af");
	}
	
	/**
	 * mixed-type computation
	 * while int add long ,the int will extend the high bits to it's sign bit
	 * 0xffffffffcafebabe + 0x00000100000000 = 0xcafebabe
	 * singn extension
	 */
	public static void testPuzzle5(){
		System.out.println(Long.toHexString(0x100000000L + 0xcafebabe));
		System.out.println(Long.toHexString(0x100000000L + 0xcafebabeL));
	}
	
	public static void testPuzzle4(){
		System.out.println(12345 + 5432l);
	}

	
	public static void testPuzzle3(){
		longDivision();
	}

	public static void testPuzzle1() {
		System.out.println(isOdd(0));
		System.out.println(isOdd(-1));
		System.out.println(isOdd(1));

	}

	/*
	 * avoid to get exact answer use float or double just use int long or
	 * BigDecimal
	 */
	public static void testPuzzle2() {

		// 1.1 convert to double in bit representation it is infinite ,so will
		// be cut off
		// when try to cast to double
		System.out.println((float)(2.0 - 1.1));
		System.out.printf("%.2f\n", 2.00 - 1.1);
		System.out.println(new BigDecimal(2.00).subtract(new BigDecimal(1.10)));
		// use BigDecimal(String) not BigDecimal(double) to resolve
		System.out.println(new BigDecimal("2.00").subtract(new BigDecimal(
				"1.10")));

		System.out.println(2.00);
		System.out.println(Double.toString(2.00));
		System.out.println(Double.toString(0.002));
		System.out.println(Double.toString(100000000));
		System.out.println(Double.toString(0.000001));
	}

	// puzzler one
	public static boolean isOdd(int i) {
		// return i %2 == 1; ignore the negative int
		return (i & 1) != 0;
	}

	/**
	 * 24 * 45 when compute it is int arithmetic,when the int is too long
	 * cast to long it will overflow
	 */
	public static void longDivision() {
		
		final long us = (long)24 * 60 * 60 * 1000 * 1000;
		final long us1 = 24 * 60L * 60 * 1000 * 1000;
		final long usL = 24L * 60 * 60 * 1000 * 1000;
		final long ms = 1;//24 * 60 *60 * 1000;
		
		final int a = 5;
		final long l = a;
		int a1 = 0x1000000;
		
		System.out.println(a1);
		System.out.println("l: " + l);
		System.out.println(us);
		System.out.println(usL);
		System.out.println(ms);
		
		System.out.println("the max of long :" + Long.MAX_VALUE);
		System.out.println("the max of int :" + Integer.MAX_VALUE);
		
		System.out.println( us / ms);
	}

}
