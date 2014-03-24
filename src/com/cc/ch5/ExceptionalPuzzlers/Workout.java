package com.cc.ch5.ExceptionalPuzzlers;

public class Workout {

	public static void main(String[] args) {
		testTryFinally();
		//workHard();
		System.out.println("It's nap time.");
	}

	private static void workHard() {
		try {
			workHard();
		} finally {
			workHard();
			
		}
	}
	
	public static void testTryFinally(){
		
		try{
			int i = 3 / 0;
		}finally{
			System.out.println("haha");
		}
	}

}
