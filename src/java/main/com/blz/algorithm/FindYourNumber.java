package com.blz.algorithm;

import com.blz.algorithm.utils.AlgorithmUtility;
import com.blz.utils.InputUtility;

public class FindYourNumber {

	public static void main(String[] args) {
		System.out.println("Enter the Low value: ");
		int low=InputUtility.intVal();
		System.out.println("Enter the High value: ");
		int high=InputUtility.intVal();
		System.out.println(AlgorithmUtility.magicNumber(low,high));
	}
}
