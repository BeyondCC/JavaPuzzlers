package com.cc.ch2.expresspuuzlers;

public class SwapMeat7 {

	public static void main(String[] args) {

		int x = 1984;//0x7c0
		int y = 2001;//0x7d1
		
		// x = 0111 1100  0000
		// y = 0111 1101  0001
		// x^=y = 0000 0001 0001
		// y ^= x ^= y: 0111 1100 0000
		// x       = 0111 1101 0001
//		x ^= y ^= x ^= y;
		x ^= y;
		y ^= x ;
		x ^= y;
		
		System.out.println("x:" + x + " y:" + y);
	}

}
