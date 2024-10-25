package com.tdd_git;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Calculator {

	public static int add(String string) {
		if(!string.isEmpty()) {
			List<Integer> list = Arrays.stream(string.split(",")).map(Integer:: parseInt)
					.collect(Collectors.toList());
			return list.stream().reduce(Integer::sum).orElseThrow();
		}
		return 0;
		
	}
}
