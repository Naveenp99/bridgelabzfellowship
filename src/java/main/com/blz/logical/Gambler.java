package com.blz.logical;

import com.blz.logical.utils.LogicalUtility;
import com.blz.utils.InputUtility;

public class Gambler {

	public static void main(String[] args) {
		System.out.println("Enter the number stakes: ");
		int stakes=InputUtility.intVal();
		System.out.println("Enter the number N: ");
		int N=InputUtility.intVal();
		System.out.println(LogicalUtility.gambler(stakes,N));
	}
}
