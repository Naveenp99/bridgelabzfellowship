package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class SumOfThreeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the N value: ");
		int N=scn.nextInt();
		int[] a=new int[N];
		System.out.println("Enter the numbers: ");
		for(int m=0;m<N;m++) {
		a[m]=scn.nextInt();
		}
		sumofthree(a);
		scn.close();
	}
	public static void sumofthree(int[] a) {
		int flag=1;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				for(int k=j+1;k<a.length;k++) {
					if(a[i]+a[j]+a[k]==0)
					{
						flag=0;
						System.out.println("triplets are FOUND");
						System.out.println("triplets are: "+a[i]+" "+a[j]+" "+a[k]);
					}
				}
			}
		}
		if(flag==1)
			System.out.println("triplets are NOT FOUND");
	}
}
