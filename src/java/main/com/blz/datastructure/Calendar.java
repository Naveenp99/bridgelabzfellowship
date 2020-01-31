package com.blz.datastructure;

import com.blz.datastructure.utils.DatastructureUtility;
import com.blz.junit.utils.JunitUtility;
import com.blz.utils.InputUtility;

public class Calendar<T> {

	public static void main(String[] args) {
		System.out.println("Enter the number of month: ");
		int month=InputUtility.intVal();
		System.out.println("Enter the number of year: ");
		int year=InputUtility.intVal();
		int d = JunitUtility.dayOfWeek(month, 1, year);
		DatastructureUtility.calendar(month,year,d); 
	}
	
}
