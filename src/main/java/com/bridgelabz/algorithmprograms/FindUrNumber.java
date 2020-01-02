package com.bridgelabz.algorithmprograms;
import java.util.*;
public class FindUrNumber  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the value of Low: ");
		int low=scn.nextInt();
		System.out.println("Enter the value of High: ");
		int high=scn.nextInt();
		//Calling Static Parameterized Methods in main Method.
		System.out.println(magicNumber(low,high));
		scn.close();
	}
	public static int magicNumber(int low,int high) {
		Scanner scn=new Scanner(System.in);
		while(low!=high) {     //while should work UpTo low!=high. 
			int mid=(low+high)/2;   //finding the middle number.
			System.out.println("Enter the number 1 if range in between "+low+" to "+mid+" else "+"Enter the number 2 if range in between "+(mid+1)+" to "+high);	
			int select=scn.nextInt();
			if(select==1)  {   //if select=1 then assign mid=high.
				high=mid;
			}
			else if(select==2) {
				low=mid+1;      //if select=2 then assign low=mid+1.
			}
			}
		scn.close();
			return high;  //return the magic number.
	
}
}