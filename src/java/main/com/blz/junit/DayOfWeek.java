package com.blz.junit;

import com.blz.junit.utils.JunitUtility;
import com.blz.utils.InputUtility;

public class DayOfWeek {

	public static void main(String[] args) {
		System.out.println("Enter the number of month: ");
		int m=InputUtility.intVal();
		System.out.println("Enter the number of date: ");
		int d=InputUtility.intVal();
		System.out.println("Enter the number of year: ");
		int y=InputUtility.intVal();
		System.out.println(JunitUtility.dayOfWeek(m,d,y)); 
	}
}
