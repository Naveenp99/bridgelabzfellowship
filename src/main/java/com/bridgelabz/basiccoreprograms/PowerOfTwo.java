package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=scn.nextInt();
		//Calling Static Parameterized Method in main Method.
		System.out.println(powerOfTwo(number));
		scn.close();
	}
	public static int powerOfTwo(int number)
	{
		int i=1; //Initialized i=0;
		int	power=1;  //Initialized Power=1;
		while(i<=number)
		{
		  //Display the Power UpTo Condition is Satisfying.
			power=2*power;  //To Find Power Multiply Power by TWO.
			i++;   //Incrementing the value of i.
		}
		return power;
	}
}
