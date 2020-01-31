package com.blz.algorithm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.blz.algorithm.utils.*;

class BubbleSortTest {

	@Test
	void testBubbleSort() {
		int[] arr = {5,3,0,1,4,2};
		int[] result = {0,1,2,3,4,5};
		int[] array = AlgorithmUtility.bubbleSort(arr);
		assertArrayEquals(result, array);
	}

}
