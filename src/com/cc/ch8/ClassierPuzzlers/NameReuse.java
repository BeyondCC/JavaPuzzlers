package com.cc.ch8.ClassierPuzzlers;

class Base {
	public static void f() {
		System.out.println("base here");
	}
	
	public void here(){
		System.out.println("here");
	}
}

class Derived extends Base {
	public static void f() {
		System.out.println("haha");
	} // hides Base.f()
	
	public void here(){
		System.out.println("derived here");
	}
}

public class NameReuse {

	public static void main(String arg[]) {
		Base b = new Base();
		Base derived = new Derived();
		b.f();
		b.here();
		derived.f();
		derived.here();
	}

}
