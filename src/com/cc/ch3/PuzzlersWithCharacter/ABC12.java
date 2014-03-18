package com.cc.ch3.PuzzlersWithCharacter;

public class ABC12 {

	public static void main(String[] args) {
		String letters = "ABC";
		
		char[] numbers = {'A', 'B', 'C'};
		char[] a = null;
		
		System.out.println(numbers.getClass().getName());
		
		//the char[] is not string, the toSting is the object
		
		//while the object is null ,the tostring is null
		// the + operator will invoke the toString method
		//the char[] inherit the object's toString
		// so the result is the the classNameof the char[] => [C + @ hashcode
		System.out.println(letters + " easy as " + numbers);
		System.out.println(letters + " easy as " + a);
		System.out.println(numbers);
		
		
		System.out.println(letters + " easy as " + String.valueOf(numbers));

		Object ob = new char[]{'1', '2', '3'};
		System.out.println(ob);  // invoke the println(Object) then the [C@hashcode
	}

}
