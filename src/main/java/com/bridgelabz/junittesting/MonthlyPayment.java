package com.bridgelabz.junittesting;

import java.util.Scanner;

public class MonthlyPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stubScanner scn=new Scanner(System.in);
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the value of P: ");
		double P=scn.nextDouble();
		System.out.println("Enter the number of Y: ");
		double Y=scn.nextDouble();
		System.out.println("Enter the number of R: ");
		double R=scn.nextDouble();
		monthlyPayment(P,Y,R);   //Calling Static Parameterized Method in main Method.
		scn.close();
	}
	public static void monthlyPayment(double P,double Y,double R) {
		double n=12*Y;       //Using Formula to Find n value.
		System.out.println("n is: "+n);
		double r=R/(1200);  //Using Formula to Find r value.
		System.out.println("r is: "+r);
//Using Formula to Find Payment.
//Math.pow(a,b) Method is used to find a power b value. 		
		double Payment=P*r/(1-Math.pow(1+r,-n));
		System.out.println("Payment is: "+Payment);
	}
}
