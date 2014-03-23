package com.cc.ch4.LoopyPuzzlers;

public class SonOfLooper {

	public static void main(String[] args) {

		String i = "saf";
		
		
		//the string type overload the  + operator,it will concatenation.
		while(i != i + 0)
			System.out.println("the looper");
	}

}
