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
		dayofweek(m,d,y);
		scn.close();
	}
	public static void dayofweek(int m,int d,int y) {
		int y0=y-(14-m)/12;
		int x=y0+(y0/4)-(y0/100)+(y0/400);
		int m0=m+12*((14-m)/12)-2;
		int d0=(d+x+(31*m0)/12)%7;
		System.out.println("Day Of Week d0 is: "+d0);
	}
}
