package com.blz.junit;

import com.blz.junit.utils.JunitUtility;
import com.blz.utils.InputUtility;

public class ToBinary {

	public static void main(String[] args) {
		System.out.println("Enter the Decimal number: ");
		int number=InputUtility.intVal();
		System.out.println(JunitUtility.toBinary(number));  
	}
}
