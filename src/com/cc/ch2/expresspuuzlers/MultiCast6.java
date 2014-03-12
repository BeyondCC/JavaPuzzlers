package com.cc.ch2.expresspuuzlers;

public class MultiCast6 {

	
	/**
	 * 	widden  primitive conversion
	 * 	when -1 cast to byte it will cut off to 8bit ,it is equals to-1 0xff
	 * 	when the byte -1 cast to char ,it will sign extension 0xffff
	 *  when char cast to int ,it is zero extension so the result is 0x0000ffff = 65535
	 */
	public static void main(String[] args) {
		
		System.out.println((byte) -1);
		System.out.println((char)(byte) -1);
		System.out.println((int)(char)(byte) -1);
		
		char c = (char)((byte) -1) & 0xff;
		System.out.println((int )c);
		
		//the char cast to short is sign extension
		int  i = (short)(char)(byte)-1;
		System.out.println(i);
	}

}
