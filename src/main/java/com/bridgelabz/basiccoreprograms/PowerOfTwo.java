package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=scn.nextInt();
		poweroftwo(number);
		scn.close();
	}
	public static void poweroftwo(int number)
	{
		int i=0;
		int	power=1;
		while(i<=number)
		{
			System.out.println("2^"+i+" is:"+power);
			power=2*power;
			i++;
		}
	}
}
