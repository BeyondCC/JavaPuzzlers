package com.cc.ch8.ClassierPuzzlers;

import com.cc.ch7.LibraryPuzzlers.CodeTalk;

public class TypeIt {
	private static class ClickIt extends CodeTalk {
		void printMessage() {
			System.out.println("Hack");
		}
	}

	public static void main(String[] args) {
		ClickIt clickit = new ClickIt();
		clickit.doIt();
	}
}
