package com.bridgelabz.junittesting;

import java.util.Scanner;

public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number: ");
		double c=scn.nextDouble();
		sqrt(c);
		scn.close();
	}
	public static void sqrt(double c) {
		double t=c;
		double epsilon=1e-15;
		while(Math.abs(t-(c/t))>epsilon*t) {
			t=(c/t+t)/2.0;
		}
		System.out.println(t);
	}
}
