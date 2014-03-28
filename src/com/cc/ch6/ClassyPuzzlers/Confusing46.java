package com.cc.ch6.ClassyPuzzlers;

public class Confusing46 {

	private Confusing46(Object o) {
		System.out.println("Object");
	}
	
//	private Confusing46(String o) {
//		System.out.println("Object");
//	}

	private Confusing46(double[] dArray) {
		System.out.println("double array");
	}

	public static void main(String[] args) {
		//null can pass to Object and double[]
		//but the double [] can pass to object
		//so the double[] is more specific  than Object
		new Confusing46(null);
//		new Confusing46((Object)null);
	}

}
