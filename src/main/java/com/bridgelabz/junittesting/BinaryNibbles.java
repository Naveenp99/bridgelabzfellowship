package com.bridgelabz.junittesting;

import java.util.Scanner;

public class BinaryNibbles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int x=scn.nextInt();
		System.out.println(binarynibbles(x));
		scn.close();
	}
	public static int binarynibbles(int x) {
		return ((x & 0x0F)<<4 | (x & 0xF0)>>4);
	}
}
