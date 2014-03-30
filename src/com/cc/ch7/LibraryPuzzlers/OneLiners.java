package com.cc.ch7.LibraryPuzzlers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class OneLiners {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("jack");
		list.add("lucy");
		list.add("keven");
		list.add("pacino");
		list.add("jack");
		
		list = getNewList(list);
		
		for(String s : list)
			System.out.println(s);
		
		String s = "fear, surprise, ruthless "
				+ "efficiency, an almost fanatical devotion to the Pope, nice red uniforms";
		
		String[] arr = getStringArray(s);
		for(String tmp : arr)
			System.out.println(tmp);
		
		printMultiArray();
	}
	
	public static List<String> getNewList(List<String> list){
		
		//get the same element in order with no duplicate element
		// be caution with the constructor use Other collection 
		return new ArrayList<String>(new LinkedHashSet<String>(list));
		
	}
	
	public static String[] getStringArray(String s){
		return s.split(",\\s*"); //s is blank character
	}
	
	public static void printMultiArray(){
		String[][] s = {{"sadf", "qweqwe","zxcczxc"},
						{"yutyuiti", "sngoi"}};
		System.out.println(Arrays.deepToString(s));
	}
	
	public static boolean hasMoreBitsSet(int i, int j){
		return Integer.bitCount(i) > Integer.bitCount(j);
	}
}