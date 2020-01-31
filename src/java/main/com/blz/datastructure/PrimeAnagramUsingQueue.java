package com.blz.datastructure;

import com.blz.datastructure.utils.DatastructureUtility;
import com.blz.utils.InputUtility;

public class PrimeAnagramUsingQueue {
	public static void main(String[] args) {
		System.out.println("Enter the low Range: ");
	   int low=InputUtility.intVal();
	   System.out.println("Enter the High Range: ");
	   int high=InputUtility.intVal();
	   DatastructureUtility.primeRangeQueue(low, high);
}
}