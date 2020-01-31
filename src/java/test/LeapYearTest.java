package com.blz.basic;

import com.blz.basic.utils.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LeapYearTest {

	@Test
	void testLeapYear() {
		boolean result = BasicUtility.leapYear(2020);
		assertEquals(true, result);
	}

}
