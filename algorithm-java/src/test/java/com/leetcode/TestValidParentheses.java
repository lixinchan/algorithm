package com.leetcode;

import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestValidParentheses {

	@Test
	public void testValid() {
		String content = "()[{}]{}";
		boolean result = ValidParentheses.isValid(content);
		System.out.println(result);
	}
}
