package com.blz.functional;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.blz.functional.utils.FunctionalUtility;

class QuadraticTest {

	@Test
	void testQuadratic() {
		String result = FunctionalUtility.quadratic(3, 2, 1);
		assertEquals("Delta =-8.0, Root1 =NaN, Root2 =NaN", result);
	}

}
