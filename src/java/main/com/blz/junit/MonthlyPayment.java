package com.blz.junit;

import com.blz.junit.utils.JunitUtility;
import com.blz.utils.InputUtility;

public class MonthlyPayment {

	public static void main(String[] args) {
		System.out.println("Enter the value of P: ");
		double P=InputUtility.doubleVal();
		System.out.println("Enter the number of Y: ");
		double Y=InputUtility.doubleVal();
		System.out.println("Enter the number of R: ");
		double R=InputUtility.doubleVal();
		System.out.println(JunitUtility.monthlyPayment(P,Y,R));   
	}
}
