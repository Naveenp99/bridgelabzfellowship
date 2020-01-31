package com.blz.junit;

import com.blz.junit.utils.JunitUtility;
import com.blz.utils.InputUtility;

public class BinaryNibbles {

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		int x=InputUtility.intVal();
		System.out.println(JunitUtility.binaryNibbles(x));   
	}
}
