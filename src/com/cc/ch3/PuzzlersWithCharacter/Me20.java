package com.cc.ch3.PuzzlersWithCharacter;

import java.util.regex.Pattern;

public class Me20 {

	public static void main(String[] args) {
		System.out.println(Me20.class.getName());

		// the first argument of the replaceall is regex. so replace all the
		// character with /
		System.out
				.println(Me20.class.getName().replaceAll(".", "/") + ".class");
		System.out.println(Me20.class.getName().replaceAll("\\.", "/")
				+ ".class");

		//自己带了转义
		System.out.println(Me20.class.getName().replaceAll(Pattern.quote("."),
				"/")
				+ ".class");

	}

}
