package com.blz.junit;

import com.blz.junit.utils.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SqrtTest {

	@Test
	void testSqrt() {
		double output = JunitUtility.sqRoot(25);
		assertEquals(5.0, output);
	}

}
