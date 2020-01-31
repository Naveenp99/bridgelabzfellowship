package com.blz.junit;

import com.blz.junit.utils.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ToBinaryTest {

	@Test
	void testToBinary() {
		int array = JunitUtility.toBinary(15);
	assertEquals(1111, array);	
	}

}
