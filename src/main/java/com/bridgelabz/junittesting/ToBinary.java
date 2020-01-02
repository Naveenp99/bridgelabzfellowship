package com.bridgelabz.junittesting;

import java.util.Scanner;

public class ToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Decimal number: ");
		int number=scn.nextInt();
		toBinary(number);  //Calling Static Method in main Method.
		scn.close();
	}
	public static void toBinary(int number){
		int index=0;
		int[] b=new int[25];   //Creating Array Object with some Length.
		while(number>0) {
			int rem=number%2;   //Store the Reminder in Variable. 
			b[index++]=rem;    //Storing the value of variable in created Integer Array.
			number/=2;        //Divide the number to get Quotient.
		}
		for(int i=index-1;i>=0;i--) {   //Reverse the Index and then Print.
			System.out.print(b[i]);
		}
	}
}
