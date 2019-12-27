package com.bridgelabz.basiccoreprograms;
import java.util.*;
public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=scn.nextInt();
		primefactors(number); 
		scn.close();
	}
	public static void primefactors(int number) {
		for(int i=2;i<number;i++) {
			while(number%i==0) {
				System.out.println(i);
				number/=i;
			}
		}
		if(number>2)
			System.out.println(number);
	}
}
