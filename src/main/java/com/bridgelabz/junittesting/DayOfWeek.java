package com.bridgelabz.junittesting;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number of month: ");
		int m=scn.nextInt();
		System.out.println("Enter the number of date: ");
		int d=scn.nextInt();
		System.out.println("Enter the number of year: ");
		int y=scn.nextInt();
		System.out.println(dayOfWeek(m,d,y)); //Calling Static Parameterized Method in main Method.
		scn.close();
	}
	public static int dayOfWeek(int m,int d,int y) {
		int y0=y-(14-m)/12;                   //Using the Formula to Find y0 value.
		int x=y0+(y0/4)-(y0/100)+(y0/400);   //Using the Formula to Find x value.
		int m0=m+12*((14-m)/12)-2;          //Using the Formula to Find m0 value.
		int d0=(d+x+(31*m0)/12)%7;         //Using the Formula to Find d0 value.
		return d0;
	}
}
