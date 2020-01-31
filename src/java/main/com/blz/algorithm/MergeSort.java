package com.blz.algorithm;

import com.blz.algorithm.utils.AlgorithmUtility;
import com.blz.functional.utils.FunctionalUtility;
import com.blz.utils.InputUtility;

public class MergeSort {

	public static void main(String[] args) {
		System.out.println("Enter the number of n: ");
		int n=InputUtility.intVal();
		int[] array=new int[n];
		System.out.print("Enter the numbers: ");
		array = FunctionalUtility.getArrayElements(n, array);
		System.out.println("Entered elements are: ");
		FunctionalUtility.displayArrayElements(array);
		AlgorithmUtility.mergeSort(array);
		System.out.println("\nSorted numbers are: ");
		for(int result:array) 
			System.out.print(result+" ");
	}
}
