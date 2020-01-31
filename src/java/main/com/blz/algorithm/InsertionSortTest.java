package com.blz.algorithm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.blz.algorithm.utils.AlgorithmUtility;

class InsertionSortTest {

	@Test
	void testInsertionSort() {
		int[] arr = {5,3,0,1,4,2};
		int[] result = {0,1,2,3,4,5};
		int[] array = AlgorithmUtility.insertionSort(arr);
		assertArrayEquals(result, array);
	}

}
