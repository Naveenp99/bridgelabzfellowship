package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the value of t: ");
		double t=scn.nextDouble();
		System.out.println("Enter the value of v: ");
		double v=scn.nextDouble();
		System.out.println(windChill(t,v));   //Calling Static Parameterized Method in main Method.
		scn.close();
	}
	public static double windChill(double t,double v) {
		if(t>50||v>120||v<3)  //Satisfying the given Condition.
			return -1;
		else {
//Finding the value of  wc using the Formulae.			
		double wc=35.74+(0.6215*t)+((0.4275*t)-35.75)*Math.pow(v, 0.16);
		return wc;
	}
	}
}
