package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeapYear lp=new LeapYear();
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int year=scn.nextInt();
		lp.leapyear(year);
		scn.close();
	}
	public void leapyear(int year)
	{
		if(year%400==0||(year%4==0 && year%100!=0))
			System.out.println(year+" is a Leap Year");
		else
			System.out.println(year+" is Not a Leap Year");
	}
}
