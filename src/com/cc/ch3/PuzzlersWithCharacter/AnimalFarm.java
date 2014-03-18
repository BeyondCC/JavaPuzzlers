package com.cc.ch3.PuzzlersWithCharacter;

public class AnimalFarm {

	public static void main(String[] args) {
		final String pig = "length: 10";
		final String dog = "length: " + pig.length();
		
		
		// A == B is to campare A and B are the same object
		// A == B compare A ,B are the same type and whether their content
		// are the same or not
		System.out.println(dog.toString());
		
		// the pripority of the + is greater than ==
		System.out.println("Animals are equal: "
					+ pig == dog);
		
		System.out.println(pig == dog);
		System.out.println(pig.equals( dog));
		
		System.out.println(1 + 3 == 4);
	}

}
