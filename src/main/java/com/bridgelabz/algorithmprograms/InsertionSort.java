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
		System.out.println("Entered elements are: ");
		for(int i=0;i<n;i++) {
			System.out.print(" "+a[i]);
		}
		sort(a);
		System.out.println("\nSorted numbers are: ");
		for(int result:a)
			System.out.print(result+" ");
		scn.close();
	}
	public static void sort(int[] a) {
		for(int i=1;i<a.length;i++) {
			int key=a[i];
			int j=i-1;
			while(j>-1 && a[j]>key) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}
}
