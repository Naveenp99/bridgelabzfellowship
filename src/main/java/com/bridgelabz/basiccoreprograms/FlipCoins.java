package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class FlipCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=scn.nextInt();
		coinflip(number);
		scn.close();
	}
	public static void coinflip(int number)
	{
		int headcount=0;
		int tailcount=0;
		for(int i=0;i<number;i++) {
		if(Math.random()<0.5)
			headcount++;
		else
			tailcount++;
	}
		System.out.println(headcount*100/number);
		System.out.println(tailcount*100/number);
	}
}
