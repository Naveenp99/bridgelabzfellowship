package com.blz.functional;

import com.blz.functional.utils.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DistanceTest {

	@Test
	void testDistance() {
		double result = FunctionalUtility.distance(25, 35);
         assertEquals(43.01162633521314, result);
}
}
