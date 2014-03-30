package com.cc.ch7.LibraryPuzzlers;

import java.util.HashSet;
import java.util.Set;

public class Name {

	private final String first, last;

	public Name(String first, String last) {
		this.first = first;
		this.last = last;
	}

	// when override the equals method , remember to implement the hashcode method
	public boolean equals(Object o) {
		if (!(o instanceof Name))
			return false;
		Name n = (Name) o;
		return n.first.equals(first) && n.last.equals(last);
	}
	
	public int hashCode() {
		return 37 * first.hashCode() + last.hashCode();
	}


	public static void main(String[] args) {
		Set<Name> s = new HashSet<Name>();
		s.add(new Name("Mickey", "Mouse"));
		System.out.println(

		s.contains(new Name("Mickey", "Mouse")));

	}
}