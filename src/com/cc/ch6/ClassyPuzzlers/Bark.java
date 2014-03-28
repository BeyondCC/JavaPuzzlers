package com.cc.ch6.ClassyPuzzlers;

class Dog1 {
	public static void bark() {
		System.out.print("woof ");
	}
}

class Basenji extends Dog1 {
	public static void bark() {
	}
}

public class Bark {
	public static void main(String args[]) {
		Dog1 woofer = new Dog1();
		Dog1 nipper = new Basenji();
		
		Basenji base = new Basenji();
		base.bark();
		
		//the static method is static dispatch at compile-time
		//so the woofer and the nipper are all Dog
		woofer.bark();
		System.out.println("==========");
		nipper.bark();
	}
}
