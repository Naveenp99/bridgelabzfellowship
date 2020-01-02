package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class HormonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int N=scn.nextInt();
		//Calling Static Parameterized Method in main Method.
		System.out.println(harmonicNumber(N));
		scn.close();
	}
	public static double harmonicNumber(int N)
	{
		double sum=0.0;       //Initialized sum=0.
		for(int i=1;i<=N;i++) //It will do the process UpTo the N value.
		{
			sum+=1.0/i;
		}//According to the HormonicNumber Condition.
			return sum;  //Display the Result.
	}
}
