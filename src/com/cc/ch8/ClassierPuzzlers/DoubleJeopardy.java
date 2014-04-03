package com.cc.ch8.ClassierPuzzlers;

class Jeopardy {
	public static final String PRIZE = "$64,000";

	public static final String prize() {
		return PRIZE;
	}

}

public class DoubleJeopardy extends Jeopardy {

	// the PRIZE hidden the PRIZE in Jeopardy
	public static final String PRIZE = "2 cents";

	public static void main(String[] args) {
		System.out.println(DoubleJeopardy.PRIZE);
		System.out.println(DoubleJeopardy.prize());
	}
}
