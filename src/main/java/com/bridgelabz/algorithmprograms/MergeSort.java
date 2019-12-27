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
		sort(a);
		System.out.println("\nSorted numbers are: ");
		for(int result:a)
			System.out.print(result+" ");
		scn.close();
	}
	public static void sort(int[] a) {
		if(a.length==1) return;
		int[] l=new int[a.length/2];
		int[] r=new int[a.length-l.length];
		int i;
		for(i=0;i<l.length;i++) {
			l[i]=a[i];
		}
		for(int j=0;j<r.length;j++) {
			r[j]=a[i];
			i++;
		}
	sort(l);
	sort(r);
	merge(l,r,a);
	}
	public static void merge(int[] a,int[] b,int[] c) {
		int i=0;
		int j=0;
		int k=0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) 
				c[k++]=a[i++];
			else
				c[k++]=b[j++];
		}
		while(i<a.length) {
			c[k++]=a[i++];
		}
		while(j<b.length) {
			c[k++]=b[j++];
		}
	}
}
