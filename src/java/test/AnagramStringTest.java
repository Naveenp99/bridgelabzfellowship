package com.blz.algorithm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.blz.algorithm.utils.*;

class AnagramStringTest {

	@Test
	void testAnagramString() {
		boolean result = AlgorithmUtility.isAnagramString("KeeP", "PeEk");
		assertEquals(true,result);
	}

}
