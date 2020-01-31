package com.blz.functional;

import com.blz.functional.utils.FunctionalUtility;
import com.blz.utils.InputUtility;

public class WindChill {
	public static void main(String[] args) {
		System.out.println("Enter the value of t: ");
		double t = InputUtility.intVal();
		System.out.println("Enter the value of v: ");
		double v = InputUtility.intVal();
		System.out.println(FunctionalUtility.windChill(t, v));
	}
}
