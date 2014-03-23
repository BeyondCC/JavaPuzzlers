package com.cc.ch4.LoopyPuzzlers;

public class Intheloop26 {

	public static final int END = Integer.MAX_VALUE;
	public static final int START = END - 100;

	public static void main(String[] args) {
		int count = 0;
		
		//end+1为负数会死循环
		for (int i = START; i <= END; i++)
			count++;
		System.out.println(count);
	}

}
