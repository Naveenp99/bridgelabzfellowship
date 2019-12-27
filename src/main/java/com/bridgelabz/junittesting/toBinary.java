package com.bridgelabz.junittesting;

import java.util.Scanner;

public class toBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Decimal number: ");
		int number=scn.nextInt();
		tobinary(number);
		scn.close();
	}
	public static void tobinary(int number){
		int index=0;
		int[] b=new int[25];
		while(number>0) {
			int rem=number%2;
			b[index++]=rem;
			number/=2;
		}
		for(int i=index-1;i>=0;i--) {
			System.out.print(b[i]);
		}
	}
}
