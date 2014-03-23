package com.cc.ch4.LoopyPuzzlers;

public class LooperMeetWithWolf {

	public static void main(String[] args) {
		
		int i = Integer.MIN_VALUE;
		
		while (i != 0 && i == -i) {
			System.out.println("loop");
		}

	}

}
