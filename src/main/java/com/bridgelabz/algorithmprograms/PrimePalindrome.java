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
		primerange(a,b);
		scn.close();
	}
	public static void primerange(int a,int b) {
		for(int i=a;i<=b;i++) {
			if(i==0||i==1) continue;
			int flag=0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
			if(i==reverse(i)) {
				System.out.print(i+" ");
			}
		}
		}
}
	public static int reverse(int number) {
		int rev=0;
		while(number>0) {
		int rem=number%10;
		rev=rev*10+rem;
		number/=10;
		}
		return rev;
	}
}
