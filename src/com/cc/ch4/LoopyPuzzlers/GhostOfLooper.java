package com.cc.ch4.LoopyPuzzlers;

public class GhostOfLooper {

	public static void main(String[] args) {

		short i = -1;

		// >>> 无符号右移
		// 复合运算操作符，对short, byte, char可能进行隐式的窄化类型转换
		// 当执行位操作的时候，the short回强制转换成int(0xffffffff)
		//无符号右移之后，当i = 0xffff,变成short，接下来的操作回到初始情况并导致死循环
		while (i != 0)
			i >>>= 1;

	}

}
