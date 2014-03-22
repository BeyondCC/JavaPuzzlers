package com.cc.ch3.PuzzlersWithCharacter;

public class LinePrinter16 {
	public static void main(String[] args) {
		// Note: \u000A // it will print \n//,so the next will in the next line
		//is Unicode representation of linefeed (LF)
		char c = 0x000A;
		System.out.println(c);
	}
}
