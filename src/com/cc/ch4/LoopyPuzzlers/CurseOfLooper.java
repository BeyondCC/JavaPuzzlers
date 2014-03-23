package com.cc.ch4.LoopyPuzzlers;

public class CurseOfLooper {

	public static void main(String[] args) {

		
		/*In summary, there is a fundamental difference in the way numerical comparison operators and
		equality operators behave when both operands are of boxed numeric types: Numerical
		comparison operators perform value comparisons, while equality operators perform reference
		identity comparisons. */

		
		/*
		 * The equality operators do perform numerical comparison when only one of their two operands is of
		a boxed numeric type and the other is of a primitive type. 
		 */
		Integer i = new Integer(0);
		Integer j = new Integer(0);
		
		
		System.out.println(new Integer(0) == 0);
		//
		while (i <= j && j <= i && i != j) {
			System.out.println("the dead loop");
		}

	}

}
