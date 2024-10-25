package com.tdd_git;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculatorTest {

	@Test
	void additionZeroForEmptyString() {
		Assertions.assertThat(Calculator.add("")).isEqualTo(0);
	}
	
	@Test
	void additionForOneInput() {
		Assertions.assertThat(Calculator.add("5")).isEqualTo(5);
	}
	
	@Test
	void additionForTwoInput() {
		Assertions.assertThat(Calculator.add("2,5")).isEqualTo(7);
	}
	
	@Test
	void additionForMultipleInput() {
		Assertions.assertThat(Calculator.add("2,5,3")).isEqualTo(10);
	}
	
	@Test
	void additionSplitByCommasAndNewLine() {
		Assertions.assertThat(Calculator.add("2,5,3\n5")).isEqualTo(15);
	}

	@Test
	void additionForDelimeter() {
		Assertions.assertThat(Calculator.add("//;2;5;5")).isEqualTo(12);
	}
	
	@Test
	void additionForNegative() {
		Assertions.assertThatThrownBy(() -> Calculator.add("1,-5,4,6,-3"))
		.hasMessageContaining("Negatives are not allowed")
		.hasMessageContaining("-5,-3");
	}
	
	

}
