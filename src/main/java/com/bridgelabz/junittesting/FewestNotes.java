package com.bridgelabz.junittesting;

import java.util.Scanner;

public class FewestNotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the amount: ");
		int amount=scn.nextInt();
		fewestnotes(amount);
		scn.close();
	}
	public static void fewestnotes(int amount) {
		int[] a= {1000,500,100,50,10,5,2,1};
		int[] count=new int[a.length];
		for(int i=0;i<a.length;i++) {
			if(amount>=a[i]) {
				count[i]=amount/a[i];
				amount=amount-count[i]*a[i];
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" is "+count[i]);
		}
	}
}
