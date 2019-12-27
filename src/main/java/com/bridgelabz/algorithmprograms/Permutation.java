package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String s: ");
		String s=scn.nextLine();
		printPermutn(s,"");
		scn.close();
	}
	 static void printPermutn(String str, String ans) 
	    { 
	        if (str.length() == 0) { 
	            System.out.print(ans + " "); 
	            return; 
	        } 
	  
	        for (int i = 0; i < str.length(); i++) { 
	            char ch = str.charAt(i); 
	            String ros = str.substring(0, i) +  
	                         str.substring(i + 1); 
	            printPermutn(ros, ans + ch); 
	        } 
	    } 
}
