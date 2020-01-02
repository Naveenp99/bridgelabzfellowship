package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class PrimePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number of a: ");
		int a=scn.nextInt();
		System.out.println("Enter the number of b: ");
		int b=scn.nextInt();
		//Calling Static Parameterized Methods in main Method.
		primeRange(a,b);
		scn.close();
	}
	public static void primeRange(int a,int b) {
		for(int i=a;i<=b;i++) {
			if(i==0||i==1) continue;  //0 and 1 is NOT a Prime Numbers.
			int flag=0;              //Creating Flag for Our reference.
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {         //Checking i is Divisible by j.  
					flag=1;         //If it is Divide then it is Not a Prime Number.
					break;         // And Flag become 1.
				}
			}
			if(flag==0) {         //If it is NOT Divide then it is a Prime Number.
			if(i==reverse(i)) {   // And Flag 0 and Calling reverse() Method.
				System.out.print(i+" ");  //Display the Final Output.
			}
		}
		}
}
	public static int reverse(int number) {
		int rev=0;  //Initialized Reverse=0.
		while(number>0) {
		int rem=number%10;    //Store the Reminder in Variable. 
		rev=rev*10+rem;   //Storing the value of variable.
		number/=10;   //Divide the number to get Quotient.
		}
		return rev;   //return the reverse number. 
	}
}
