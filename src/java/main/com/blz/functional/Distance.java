package com.blz.functional;

import com.blz.functional.utils.FunctionalUtility;
import com.blz.utils.InputUtility;

public class Distance {
	public static void main(String[] args) {
		System.out.println("Enter the number x: ");
		int x=InputUtility.intVal();
		System.out.println("Enter the number y: ");
		int y=InputUtility.intVal();
		System.out.println(FunctionalUtility.distance(x,y)+" metre");
	}
}
