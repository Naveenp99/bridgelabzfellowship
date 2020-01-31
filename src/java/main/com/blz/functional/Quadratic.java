package com.blz.functional;

import com.blz.functional.utils.FunctionalUtility;
import com.blz.utils.InputUtility;

public class Quadratic {

	public static void main(String[] args) {
		System.out.println("Enter the number a: ");
		double a=InputUtility.doubleVal();
		System.out.println("Enter the number b: ");
		double b=InputUtility.doubleVal();
		System.out.println("Enter the number c: ");
		double c=InputUtility.doubleVal();
		System.out.println(FunctionalUtility.quadratic(a, b, c)); 
		
	}
	
}
