package com.tdd_git;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculatorTest {

	@Test
	void additionZeroForEmptyString() {
		Assertions.assertThat(Calculator.add("")).isEqualTo(0);
	}
	
//	@Test
//	void additionForOneInput() {
//	}
//	
//	@Test
//	void additionForTwoInput() {
//	}
//	
//	@Test
//	void additionForMultipleInput() {
//	}
//	
//	@Test
//	void additionSplitByCommasAndNewLine() {
//	}
//
//	@Test
//	void additionForDelimeter() {
//	}
//	
//	@Test
//	void additionForNegative() {
//	}
	
	

}
