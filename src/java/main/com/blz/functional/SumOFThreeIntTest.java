package com.blz.functional;

import com.blz.functional.utils.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOFThreeIntTest {

	@Test
	void testSumOFThreeInt() {
		int[] a = {1,5,2,0,-2,10};
		String result = FunctionalUtility.sumOfThreeInt( a) ;
		assertEquals("triplets are FOUND", result);
	}

}
