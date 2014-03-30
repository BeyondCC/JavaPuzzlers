package com.cc.ch7.LibraryPuzzlers;

import java.util.HashSet;
import java.util.Set;

public class Differences {
	public static void main(String[] args) {
		int vals[] = { 789, 678, 567, 456, 345, 234, 123, 012 /* it is 10 ocx num */};
		for(int i : vals){
			System.out.println(i);
		}
		System.out.println("============");
		Set<Integer> diffs = new HashSet<Integer>();
		for (int i = 0; i < vals.length; i++)
			for (int j = i; j < vals.length; j++){
				System.out.println("here:" + (vals[i] - vals[j]));
				diffs.add(vals[i] - vals[j]);
			}
		
		for(Integer i : diffs){
			System.out.println(i);
		}
		System.out.println(diffs.size());
	}
}
