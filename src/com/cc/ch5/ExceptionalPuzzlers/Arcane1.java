package com.cc.ch5.ExceptionalPuzzlers;

import java.io.IOException;

public class Arcane1 {

	public static void main(String[] args) {
		try {
			System.out.println("Hello world");
		} catch (Exception e) {
			System.out.println("I've never seen println fail!");
		}

		try {
			// If you have nothing nice to say, say nothing
		} catch (Exception e) {
			System.out.println("This can't happen");
		}

	}

}
