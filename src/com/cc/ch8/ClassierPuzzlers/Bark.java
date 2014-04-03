package com.cc.ch8.ClassierPuzzlers;

class Dog {
	public static void bark() {
		System.out.print("dog ");
	}
}

class Basenji extends Dog {
	public static void bark() {
		System.out.print("Basenji");
	}
}

public class Bark {
	public static void main(String args[]) {
		Dog woofer = new Dog();
		Dog nipper = new Basenji();
		woofer.bark();
		nipper.bark();
	}
}