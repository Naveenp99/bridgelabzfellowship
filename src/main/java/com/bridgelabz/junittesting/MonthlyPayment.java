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
		monthlypayment(P,Y,R);
		scn.close();
	}
	public static void monthlypayment(double P,double Y,double R) {
		double n=12*Y;
		System.out.println("n is: "+n);
		double r=R/(1200);
		System.out.println("r is: "+r);
		double Payment=P*r/(1-Math.pow(1+r,-n));
		System.out.println("Payment is: "+Payment);
	}
}
