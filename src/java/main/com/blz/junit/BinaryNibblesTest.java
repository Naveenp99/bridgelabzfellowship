package com.blz.junit;

import com.blz.junit.utils.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinaryNibblesTest {

	@Test
	void testBinaryNibbles() {
		int output = JunitUtility.binaryNibbles(55);
		assertEquals(115, output);
	}

}
