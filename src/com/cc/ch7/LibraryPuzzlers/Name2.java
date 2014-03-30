package com.cc.ch7.LibraryPuzzlers;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Name2 {

	private final String first, last;

	public Name2(String first, String last) {
		this.first = first;
		this.last = last;
	}

	//it just overload the method equals
	public boolean equals(Name2 n) {
		return n.first.equals(first) && n.last.equals(last);
	}

	/**
	 * The lesson of this puzzle is: Don't overload a method when you want to override. To avoid
		unintentional overloading, mechanically copy the declaration of each superclass method that
		you want to override, or better yet, let your IDE do it for you. Besides protecting you against
		unintentional overloading, this protects you against misspelling method names. If you are using

	 */
	
	//it override the method equals in Object
	public boolean equals(Object o) {
		if (!(o instanceof Name2))
			return false;
																										
		Name2 n = (Name2) o;
		return n.first.equals(first) && n.last.equals(last);
	}

	public int hashCode() {
		return 31 * first.hashCode() + last.hashCode();
	}

	public static void main(String[] args) {
		Set<Name2> s = new HashSet<Name2>();
		s.add(new Name2("Donald", "Duck"));
		System.out.println(s.contains(new Name2("Donald", "Duck")));

	}
}
