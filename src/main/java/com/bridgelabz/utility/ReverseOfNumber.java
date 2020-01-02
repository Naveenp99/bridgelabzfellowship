package com.bridgelabz.utility;

import java.util.Scanner;

public class ReverseOfNumber {
	public static int reverse(int number) {
		int rev=0;  //Initialized Reverse=0.
		while(number>0) {
		int rem=number%10;    //Store the Reminder in Variable. 
		rev=rev*10+rem;   //Storing the value of variable.
		number/=10;   //Divide the number to get Quotient.
		}
		return rev;   //return the reverse number. 
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=scn.nextInt();
		System.out.println(reverse(number));
	}
}
