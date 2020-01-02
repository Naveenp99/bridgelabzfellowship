package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class MergeSort {

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
		for(int result:a)  //Use foreach loop to Store the elements.
			System.out.print(result+" ");
		scn.close();
	}
	public static void sort(int[] a) {
		if(a.length==1) return;  //while splitting length is equals to 1 then function should be return.
		int[] l=new int[a.length/2];       //Splitting the Array.
		int[] r=new int[a.length-l.length];
		int i;
		for(i=0;i<l.length;i++) {
			l[i]=a[i];    //Storing Half Array to the Left.
		}
		for(int j=0;j<r.length;j++) {
			r[j]=a[i];      //Storing Half Array to the Right.
			i++;
		}
	sort(l);    //Splitting and Storing the Left Array.
	sort(r);      //Splitting and Storing the right Array
	merge(l,r,a);   //Calling the Merge sort.
	}
	public static void merge(int[] a,int[] b,int[] c) {
		int i=0;   //initialized i=0.
		int j=0;     //initialized j=0.
		int k=0;    //initialized k=0.
		while(i<a.length && j<b.length) {
			if(a[i]<b[j])   //Comparing Left with Right Array.
				c[k++]=a[i++];   //Storing sorted Array.
			else
				c[k++]=b[j++];   //Storing sorted Array.
		}
		while(i<a.length) {
			c[k++]=a[i++];       
		}
		while(j<b.length) {
			c[k++]=b[j++];
		}
	}
}
