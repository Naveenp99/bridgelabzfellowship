package com.blz.basic;

import com.blz.basic.utils.BasicUtility;
import com.blz.utils.InputUtility;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		int year=InputUtility.intVal();
		System.out.println(BasicUtility.leapYear(year));
	}
}
