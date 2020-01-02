package com.bridgelabz.functionalprograms;
import java.util.*;
public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a=new int[20][20];
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number of Rows: ");
		int r=scn.nextInt();
		System.out.println("Enter the number of Columns: ");
		int c=scn.nextInt();
//Calling Static Parameterized Method in main Method.
		twoDArray(a,r,c); 
		scn.close();
	}
	public static void twoDArray(int[][] a,int rows,int columns) {
		Scanner scn=new Scanner(System.in);
//Here we can enter the numbers 
//Depends on Number of ROWs and COLUMNs		
		for(int i=0;i<rows;i++) {       
			for(int j=0;j<columns;j++) {
				System.out.println("enter the number: ");
				a[i][j]=scn.nextInt();
			}
		}
//Here we can Display the entered numbers 		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(a[i][j]);
	}
			System.out.println();
	}
		scn.close();
	}
}
