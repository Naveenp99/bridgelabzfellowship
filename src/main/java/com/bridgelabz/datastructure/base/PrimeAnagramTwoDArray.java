package com.bridgelabz.datastructure.base;

import java.util.Scanner;

public class PrimeAnagramTwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn=new Scanner(System.in);
		   System.out.println("Enter the number of c: ");
		   int c=scn.nextInt();
		   System.out.println("Enter the number of d: ");
		   int d=scn.nextInt();
		primeRange(c,d);
	}
	public static int primeNumber(int num) {
		   if(num<=1)  return 0;
				for(int k=2;k<=num/2;k++) {
					if(num%k==0) {
						return 0;
					}
				}
					return 1;	
			}
			public static void primeRange(int a,int b) {
				int[][] arr1=new int[a+1][b+1];
				System.out.println("prime anagrams are: ");
				for(int i=a;i<=b;i++) {
					if(i==1||i==0||i<9) continue;
					int flag=0;
					for(int j=2;j<=i/2;j++) {
						if(i%j==0) {
							flag=1;
							break;
						}
					}
					if(flag==0) {
						if(anagram(i)==1) {
							arr1[a][b]=i;
						System.out.print(arr1[a][b]+" ");
				}
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
					return primeNumber(rev);
			}
}
