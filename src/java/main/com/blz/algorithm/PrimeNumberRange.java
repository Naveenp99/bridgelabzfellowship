package com.blz.algorithm;

import com.blz.algorithm.utils.AlgorithmUtility;
import com.blz.utils.InputUtility;

public class PrimeNumberRange {

	public static void main(String[] args) {
		System.out.println("Enter the low Range: ");
		int low=InputUtility.intVal();
		System.out.println("Enter the High Range: ");
		int high=InputUtility.intVal();
		AlgorithmUtility.primeRange(low,high);
	}
}
