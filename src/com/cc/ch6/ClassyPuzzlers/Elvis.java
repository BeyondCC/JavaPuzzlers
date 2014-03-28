package com.cc.ch6.ClassyPuzzlers;

import java.util.Calendar;

public class Elvis {
	
	public static final Elvis INSTANCE = new Elvis();
	private final int beltSize;
	
	
	private static final int CURRENT_YEAR = Calendar.getInstance().get(
			Calendar.YEAR);

	public Elvis() {
		// the current_year is default value 0 because it isn't initialization
		beltSize = CURRENT_YEAR - 1930;
	}

	public int beltSize() {
		return beltSize;
	}

	public static void main(String[] args) {
		
		System.out.println(Calendar.getInstance().get(
			Calendar.YEAR));
		System.out.println("Elvis wears a size " + INSTANCE.beltSize()
				+ " belt.");
	}
}