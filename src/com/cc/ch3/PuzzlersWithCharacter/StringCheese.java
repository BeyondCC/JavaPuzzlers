package com.cc.ch3.PuzzlersWithCharacter;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class StringCheese {

	public static void main(String[] args) throws UnsupportedEncodingException {

		testUTF8();
		test();
		System.out.println("\n");
		System.out.println("\u4E25");
		byte bytes[] = new byte[256];
		for (int i = 0; i < 256; i++)
			bytes[i] = (byte) i;
		String str = new String(bytes);
		System.out
				.println("default charset:" + Charset.defaultCharset().name());
		System.out.println("str:length:" + str.length());
		for (int i = 0, n = str.length(); i < n; i++)
			System.out.print((int) str.charAt(i) + " ");

		try {
			str = new String(bytes, "ISO-8859-1");
			System.out.println("str:length:" + str.length());
			for (int i = 0, n = str.length(); i < n; i++)
				System.out.print((int) str.charAt(i) + " ");

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		try {
			str = new String(bytes, "UTF-8");
			System.out.println("str:length:" + str.length());
			for (int i = 0, n = str.length(); i < n; i++)
				System.out.print((int) str.charAt(i) + " ");

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	public static void test() throws UnsupportedEncodingException {
		byte[][] bytes = {
				// 00110001
				{ (byte) 0xF0 },
				// 11000000 10110001
				{ (byte) 0xC0, (byte) 0xB1 },
				// 11100000 10000000 10110001
				{ (byte) 0xE0, (byte) 0x80, (byte) 0xB1 },
				// 11110000 10000000 10000000 10110001
				{ (byte) 0xF0, (byte) 0x80, (byte) 0x80, (byte) 0xB1 },
				// 11111000 10000000 10000000 10000000 10110001
				{ (byte) 0xF8, (byte) 0x80, (byte) 0x80, (byte) 0x80,
						(byte) 0xB1 },
				// 11111100 10000000 10000000 10000000 10000000 10110001
				{ (byte) 0xFC, (byte) 0x80, (byte) 0x80, (byte) 0x80,
						(byte) 0x80, (byte) 0xB1 }, };
		for (int i = 0; i < 6; i++) {
			String str = new String(bytes[i], "UTF-8");
			System.out.println("原数组长度：" + bytes[i].length + "/t转换为字符串：" + str
					+ "/t转回后数组长度：" + str.getBytes("UTF-8").length
					+ " " + Integer.toHexString((int)str.getBytes("UTF-8")[0])
					+ " " + (int)str.getBytes("UTF-8")[0]);
		}

	}
	
	public static void testUTF8() throws UnsupportedEncodingException{
		byte[] bytes = {
				(byte)128,
		};
		
		String str = new String(bytes, "UTF-8");
		
		System.out.println((int)str.charAt(0));
	}

}
