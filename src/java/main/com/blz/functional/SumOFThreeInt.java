package com.blz.functional;

import com.blz.functional.utils.FunctionalUtility;
import com.blz.utils.InputUtility;

public class SumOFThreeInt {

	public static void main(String[] args) {
		System.out.println("Enter the limit: ");
		int limit = InputUtility.intVal();
		int[] array = new int[limit];
		System.out.println("Enter " + limit + " Elements: ");
		array = FunctionalUtility.getArrayElements(limit, array);
		System.out.println(FunctionalUtility.sumOfThreeInt(array));
	}

	

}
