package com.cc.ch3.PuzzlersWithCharacter;

import java.io.File;

public class MeToo21 {
	public static void main(String[] args) {
		
		System.out.println(File.separator);
		System.out.println(MeToo21.class.getName().replaceAll("\\.",
				File.separator)
				+ ".class");
	}

}
