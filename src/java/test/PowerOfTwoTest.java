package com.blz.basic;

import com.blz.basic.utils.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PowerOfTwoTest {

	@Test
	void testPowerOfTwo() {
		int result = BasicUtility.powerOfTwo(4);
		assertEquals(16, result);
	}

}
