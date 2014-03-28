package com.cc.ch6.ClassyPuzzlers;

public class Creator {
	public static void main(String[] args) {
		
		//the follow is error 
	/*	A local variable declaration looks like a statement but technically speaking is not; it is a local
		variable declaration statement [JLS 14.4]. The syntax of the language does not allow a local
		variable declaration statement as the statement repeated by a for, while, or do loop [JLS 14.12-14].
		A local variable declaration can appear only as a statement directly within a block. (A block is
		a pair of curly braces and the statements and declarations contained within it.) */

//		for (int i = 0; i < 100; i++)
//			Creature creature = new Creature();
		
		for (int i = 0; i < 100; i++)
			new Creature();
		System.out.println(Creature.numCreated());
		}
}

class Creature {
	private static long numCreated = 0;

	public Creature() {
		synchronized (Creature.class) {
			numCreated++;
		}
	}

	public synchronized static long numCreated() {
		return numCreated;
	}
}