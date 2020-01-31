package com.blz.junit;

import com.blz.junit.utils.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MonthlyPaymentTest {

	@Test
	void testMonthlyPayment() {
		String result = JunitUtility.monthlyPayment(5, 2.5, 5);
		assertEquals("Payment is: 0.17764682181688318", result);
	}

}
