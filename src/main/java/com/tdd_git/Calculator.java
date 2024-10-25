package com.tdd_git;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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

	
   private static List<Integer> strArrayToIntList(String[] strArray) {
		return Arrays.stream(strArray).map(Integer::parseInt).collect(Collectors.toList());
	}

   private static String[] getSplit(String string) {
	if(string.startsWith("//")) {
		Matcher matcher = Pattern.compile("//(.)\n(.*);").matcher(string);
		if(matcher.matches()) {
			String delimeter = matcher.group(1);
			String toSplit = matcher.group(2);
			return toSplit.split(delimeter);
		}
	}
	return string.split(",|\n");
   }
   
}
