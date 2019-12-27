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
		windchill(t,v);
		scn.close();
	}
	public static void windchill(double t,double v) {
		if(t>50||v>120||v<3)
			System.out.println("The Formula is NOT Valid");
		else {
		double wc=35.74+(0.6215*t)+((0.4275*t)-35.75)*Math.pow(v, 0.16);
		System.out.println(wc);
	}
	}
}
