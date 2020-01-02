package com.bridgelabz.algorithmprograms;
import java.util.*;
public class Generic<T> {    //T is the Datatype in Generics.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n=scn.nextInt();
		Integer[] a=new Integer[n];  //Creating Integer Array.
		System.out.print("Enter the unsorted elements: ");
		for(int i=0;i<n;i++) {
			a[i]=scn.nextInt();
		}
		//Calling Static Parameterized Methods in main Method.
		sort(a);
		for(Object o:a)  //Storing a values in another Variable.
			System.out.print(o+" ");  //Displaying Final Results
		scn.close();
	}
	public static<T> void sort(T[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if((((Comparable) a[j]).compareTo(a[j+1]))>0) {   //in Generics we should use compareTo().
					T temp=a[j];  //Using temp variable SWAP the elements.
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	}

