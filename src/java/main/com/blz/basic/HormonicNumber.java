package com.blz.basic;

import com.blz.basic.utils.BasicUtility;
import com.blz.utils.InputUtility;

public class HormonicNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		int N=InputUtility.intVal();
		System.out.println(BasicUtility.harmonicNumber(N));
	}
}
