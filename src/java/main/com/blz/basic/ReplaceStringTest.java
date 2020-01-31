package com.blz.basic;

import com.blz.basic.utils.*;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class ReplaceStringTest {

	@Test
	void test() {
		String output = BasicUtility.replaceString("C++ Always Follows OOPs Concept.", "C++", "Java");
		assertEquals("Java Always Follows OOPs Concept.", output);
	}

}
