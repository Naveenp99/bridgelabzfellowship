package com.bridgelabz.junittesting;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number Celsius: ");
		double C=scn.nextDouble();
		System.out.println("Enter the number Fahrenheit: ");
		double F=scn.nextDouble();
		celsiusTofahrenheit(C);
		fahrenheitTocelsius(F);
		scn.close();
	}
	public static void celsiusTofahrenheit(double C) {
		double F=(C*9/5)+32;
		System.out.println("fahrenheit F is: "+F);
	}
	public static void fahrenheitTocelsius(double F) {
		double C=(F-32)*5/9;
		System.out.println("Celsius C is: "+C);
	}
}
