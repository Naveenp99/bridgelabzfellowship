package com.bridgelabz.junittesting;

import java.util.Scanner;

public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number: ");
		double c=scn.nextDouble();
		System.out.println(sqRoot(c));    //Calling Static Parameterized Method in main Method.
		scn.close();
	}
	public static double sqRoot(double c) {
		double t=c;                //Initialized as t=c.
		double epsilon=1e-15;     //Initialize the value of Epsilon.
//Math.abs() will give UnSigned and Absolute value.		
		while(Math.abs(t-(c/t))>epsilon*t) {
			t=(c/t+t)/2.0;         //t value is Average of c/t and t.
		}
		return t;
	}
}
