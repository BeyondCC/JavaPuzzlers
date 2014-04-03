package com.cc.ch8.ClassierPuzzlers;

public class ShadesOfGray {
	public static void main(String[] args) {
		System.out.println(X.Y.Z);
		
		
		//the null reference can cast to the class X.Y
		//so we can access the Z field
		System.out.println(((X.Y)null).Z);
	}
}

/**
 * 
 *  When a variable and a type have the same name and both are in scope,
 *   the variable name takes precedence [JLS 6.5.2]. 
 *   The variable name is said to obscure the type name [JLS 6.3.2].
 *    Similarly,variable and type names can obscure package names. 
 *    This rule is indeed obscure
 *
 */
class X {
	static class Y {
		//variable > type > package
		static String Z = "Black";
	}

	static C Y = new C();
}

class C {
	String Z = "White";
}
