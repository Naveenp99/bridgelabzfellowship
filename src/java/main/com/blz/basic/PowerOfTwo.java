package com.blz.basic;

import com.blz.basic.utils.BasicUtility;
import com.blz.utils.InputUtility;

public class PowerOfTwo {

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		int number=InputUtility.intVal();
		System.out.println(BasicUtility.powerOfTwo(number));
	}
}
