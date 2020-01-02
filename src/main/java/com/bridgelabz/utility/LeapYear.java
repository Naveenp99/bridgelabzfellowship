package com.bridgelabz.utility;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int year=scn.nextInt();
		//Calling Static Parameterized Method in main Method.
		System.out.println(leapYear(year));
		scn.close();
	}
	public static boolean leapYear(int year)
	{
//Putting the Condition to Check the Entered Year is Leap Year or Not.		
		if(year%400==0||(year%4==0 && year%100!=0))
			return true;
		else
			return false;
	}
}
