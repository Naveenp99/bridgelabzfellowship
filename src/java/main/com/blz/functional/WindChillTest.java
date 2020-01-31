package com.blz.functional;

import com.blz.functional.utils.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WindChillTest {

	@Test
	void testWindChill() {
		double output = FunctionalUtility.windChill(25, 99);
		assertEquals(-1.001349451793189, output);
	}

}
