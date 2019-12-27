package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class HormonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int N=scn.nextInt();
		harmonicnumber(N);
		scn.close();
	}
	public static void harmonicnumber(int N)
	{
		double sum=0.0;
		for(int i=1;i<=N;i++)
		{
			sum+=1.0/i;
			System.out.println(sum);
		}
	}
}
