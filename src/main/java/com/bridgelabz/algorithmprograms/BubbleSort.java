package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class BubbleSort {

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
		System.out.println("Entered elements are: ");
		for(int i=0;i<n;i++) {
			System.out.print(" "+a[i]);
		}
		//Calling Static Parameterized Methods in main Method.
		sort(a);
		System.out.println("\nSorted numbers are: ");
		for(int output:a)
			System.out.print(output+" ");   //print final output.
		scn.close();
	}
	public static void sort(int[] a) {
		for(int i=0;i<a.length;i++) {  //do the iteration UpTo length of the a.
			for(int j=0;j<a.length-1-i;j++) {   //starting with 0 index.
				if(a[j]>a[j+1]) {  //Comparing first index with next index.
					int temp=a[j];   //SWAP using temp Integer.
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
}
