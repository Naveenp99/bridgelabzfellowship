package com.blz.junit;

import com.blz.junit.utils.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DayOfWeekTest {

	@Test
	void testDayOfWeek() {
		int result = JunitUtility.dayOfWeek(05, 25, 1998);
		assertEquals(1, result);
	}

}
