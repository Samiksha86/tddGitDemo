package com.tdd_git;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Calculator {

//	public static int add(String string) {
//		if(!string.isEmpty()) {
//			List<Integer> list = Arrays.stream(string.split(",|\n")).map(Integer:: parseInt)
//					.collect(Collectors.toList());
//			return list.stream().reduce(Integer::sum).orElseThrow();
//		}
//		return 0;
//		
//	}
	
	public static int add(String string) {
		if(!string.isEmpty()) {
			List<Integer> list = strArrayToIntList(getSplit(string));
			return list.stream().reduce(Integer::sum).orElseThrow();
		}
		return 0;
		
	}

   private static List<Integer> strArrayToIntList(Object split) {
		// TODO Auto-generated method stub
		return null;
	}

   private static Object getSplit(String string) {
	// TODO Auto-generated method stub
	return null;
}
}
