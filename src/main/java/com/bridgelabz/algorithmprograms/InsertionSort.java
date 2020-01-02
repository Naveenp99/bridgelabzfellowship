package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number of n: ");
		int n=scn.nextInt();
		int[] a=new int[n];
		System.out.print("Enter the numbers: ");
		for(int i=0;i<n;i++) {
		 a[i]=scn.nextInt();
		}
		System.out.println("Entered unsorted elements are: ");
		for(int i=0;i<n;i++) {
			System.out.print(" "+a[i]);
		}
		//Calling Static Parameterized Methods in main Method.
		sort(a);
		System.out.println("\nSorted numbers are: ");
		for(int result:a)
			System.out.print(result+" ");
		scn.close();
	}
	public static void sort(int[] a) {
		for(int i=1;i<a.length;i++) {  //Initialized i=1.
			int key=a[i];   //Assign key=a[i].
			int j=i-1;      //Put Previous index of i is j. i.e j=i-1 
			while(j>=0 && a[j]>key) {  //j is Greater than -1 or equal to ZERO.
				a[j+1]=a[j];   //Comparing a[j] with key.
				j--;   //Decrementing j value. 
			}
			a[j+1]=key;
		}
	}
}
