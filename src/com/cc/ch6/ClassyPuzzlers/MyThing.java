package com.cc.ch6.ClassyPuzzlers;

public class MyThing extends Thing {

	private final int arg;

	public MyThing() {
		this(SomeOtherClass.func());
	}

	private MyThing(int i) {
		super(i);
		arg = i;
	}
//	public MyThing() {
//		super(arg = SomeOtherClass.func());
//		}

}

class SomeOtherClass {
	public static int func() {
		return 1;
	}
}