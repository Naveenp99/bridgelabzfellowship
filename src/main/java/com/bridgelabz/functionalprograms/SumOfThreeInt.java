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
//Calling Static Parameterized Method in main Method.		
		System.out.println(sumOfThreeInt(a));    
		scn.close();
	}
	public static String sumOfThreeInt(int[] a) {
		int flag=1;    //Creating flag Integer for Our Reference.
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				for(int k=j+1;k<a.length;k++) {
//Putting the Condition Sum Of Three Integer is Equal to Zero.
					if(a[i]+a[j]+a[k]==0)         
					{
						flag=0;
//Displaying the Three Integers if Integers are Found.					
						return "triplets are FOUND"; 
					}
				}
			}
		}
		return "triplets are NOT FOUND";
	}
}
