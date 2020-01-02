package com.bridgelabz.junittesting;

import java.util.Scanner;

public class BinaryNibbles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int x=scn.nextInt();
		System.out.println(binaryNibbles(x));   //Calling Static Parameterized Method in main Method.
		scn.close();
	}
	public static int binaryNibbles(int x) {
//To find binary Nibbles swap Nibbles and Add Left Four bit and Right Four bit.		
		return ((x & 0x0F)<<4 | (x & 0xF0)>>4);
	}
}
