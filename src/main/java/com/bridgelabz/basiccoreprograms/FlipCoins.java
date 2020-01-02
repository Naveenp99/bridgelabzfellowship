package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class FlipCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=scn.nextInt();
		System.out.println("Enter the number: ");
		int num=scn.nextInt();
		System.out.println(flipCoin(num));
		//Calling Static Parameterized Method in main Method.
		System.out.println(flipCoins(number));
		scn.close();
	}
	public static int flipCoins(int number)
	{
		int headCount=0;  //Initialized headCount=0.
		int tailCount=0;  //Initialized tailCount=0.
		for(int i=0;i<number;i++) {
		if(Math.random()<0.5)
			headCount++;     //Counting the Number of Heads.
		else
			tailCount++;     //Counting the Number of Tails.
	}
		return headCount*100/number;  //Displaying the Percentage of Heads.
		  //Displaying the Percentage of Tails.
	}
	public static int flipCoin(int num)
	{
		int headCount=0;  //Initialized headCount=0.
		int tailCount=0;  //Initialized tailCount=0.
		for(int i=0;i<num;i++) {
		if(Math.random()<0.5)
			headCount++;     //Counting the Number of Heads.
		else
			tailCount++;     //Counting the Number of Tails.
	}
		return tailCount*100/num;  //Displaying the Percentage of Heads.
		  //Displaying the Percentage of Tails.
	}
}
