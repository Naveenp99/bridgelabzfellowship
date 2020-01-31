package com.blz.junit;

import com.blz.junit.utils.JunitUtility;
import com.blz.utils.InputUtility;

public class TempConver {

	public static void main(String[] args) {
		System.out.println("Enter the number Celsius: ");
		double C=InputUtility.doubleVal();
		System.out.println("Enter the number Fahrenheit: ");
		double F=InputUtility.doubleVal();
		System.out.println(JunitUtility.celsiusTofahrenheit(C));  
		System.out.println(JunitUtility.fahrenheitTocelsius(F));  
	}
}
