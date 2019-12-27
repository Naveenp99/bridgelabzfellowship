package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class PrimeAnagram {

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
	public static int primenumber(int num) {
   if(num<=1)  return 0;
		for(int k=2;k<=num/2;k++) {
			if(num%k==0) {
			return 0;
			}
		}
			return 1;	
	}
	public static void primerange(int a,int b) {
		for(int i=a;i<=b;i++) {
			if(i==1||i==0) continue;
			int flag=0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				if(anagram(i)==1)
				System.out.print(i+" ");
		}
		}
	}
	public static int anagram(int number) {
		int rev=0;
		while(number>0) {
		int rem=number%10;
		rev=rev*10+rem;
		number/=10;
		}
			return primenumber(rev);
	}
}
