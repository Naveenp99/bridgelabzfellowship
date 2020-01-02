package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number a: ");
		double a=scn.nextDouble();
		System.out.println("Enter the number b: ");
		double b=scn.nextDouble();
		System.out.println("Enter the number c: ");
		double c=scn.nextDouble();
//Calling Static Parameterized Method in main Method.
		quadratic(a,b,c); 
		scn.close();
	}
	public static void quadratic(double a,double b,double c) {
		double delta;
		double root1;          //Declaring the Variables.
		double root2;
		delta=Math.pow(b, 2)-(4*a*c);          //Finding the value of  delta using the Formulae.
		root1=(-b+Math.sqrt(delta))/(2*a);     //Finding the value of  root1 using the Formulae.
		root2=(-b-Math.sqrt(delta))/(2*a);     //Finding the value of  root2 using the Formulae.
		System.out.println("delta,root1,root2 is: "+delta+","+root1+","+root2);   //Displaying the Final Result.
	}
}
