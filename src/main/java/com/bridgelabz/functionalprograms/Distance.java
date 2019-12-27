package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number x: ");
		int x=scn.nextInt();
		System.out.println("Enter the number y: ");
		int y=scn.nextInt();
		distance(x,y);
		scn.close();
	}
	public static void distance(int x,int y) {
		double distance=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
		System.out.println(distance);
	}
}
