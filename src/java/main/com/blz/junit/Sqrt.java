package com.blz.junit;

import com.blz.junit.utils.JunitUtility;
import com.blz.utils.InputUtility;

public class Sqrt {

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		double c=InputUtility.doubleVal();
		System.out.println(JunitUtility.sqRoot(c));    
	}	
}
