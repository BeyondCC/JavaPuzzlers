package com.cc.ch5.ExceptionalPuzzlers;

public class Strange1 {

	public static void main(String[] args) {
		try {
			Missing m = new Missing();
		} catch (java.lang.NoClassDefFoundError ex) {
			System.out.println("Got it!");
		}

		//当进行class文件校验的时候，当推出main方法的时候，包含Missing和NoClassDefFoundError的实例，找他们的共同父节点
		//这个时候需要加载他们的class文件，so 会出现notclasssfoundError,but strange2 will catch the exception
		//when execute
	}
}


