package com.blz.basic;

import com.blz.basic.utils.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HormonicNumberTest {

	@Test
	void testHormonicNumber() {
		double output = BasicUtility.harmonicNumber(4);
		assertEquals(2.083333333333333, output);
	}

}
