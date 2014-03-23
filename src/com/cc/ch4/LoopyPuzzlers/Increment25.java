package com.cc.ch4.LoopyPuzzlers;

public class Increment25 {

	public static void main(String[] args) {
		int j = 0;
		for (int i = 0; i < 100; i++)
			j = j++;
		
		//iload 1   j压栈j =0
		//iinc 1 1 对局部变量1j加1
		//istore 1 弹栈给j j = 0
		System.out.println(j);
	}
	
	
	public static void test(){
		int j = 0;
		j = j++;
		System.out.println(j);
	}

}
