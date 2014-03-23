package com.cc.ch4.LoopyPuzzlers;

public class Shifty27 {

	public static void main(String[] args) {
		System.out.println(-1 << 32);
		System.out.println(-3 << 32);
		int i = 0;
		
		//when i = 32, -1<< 32 = -1,so,it will dead loop
		//when i is 32-bit integer ,it can only left shift or right shift 0 to 31 bit
		//when shit to 32 bit , it will remain its value,result will mod 32
		//when i is 54-bit long, it will shift 0 to 63, the result will mod 64
		while (-1 << i != 0)
			i++; 
		System.out.println(i);

		
	}

}
