package com.cc.ch6.ClassyPuzzlers;

public class SumFun52 {
	
	

	static {
		initializeIfNecessary();
	}
	private static int sum;

	public static int getSum() {
		initializeIfNecessary();
		return sum;
	}

	private static boolean initialized = false;

	private static synchronized void initializeIfNecessary() {
		if (!initialized) {
			for (int i = 0; i < 100; i++)
				sum += i;
			initialized = true;
		}
	}

	public static void main(String[] args) {
		System.out.println(SumFun52.getSum());
	}

}
