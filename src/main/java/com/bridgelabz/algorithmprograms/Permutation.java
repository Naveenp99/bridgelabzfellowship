package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String s: ");
		String s=scn.nextLine();
		//Calling Static Parameterized Methods in main Method.
		printPermutn(s,"");
		scn.close();
	}
	 static void printPermutn(String str, String ans) 
	    { 
		 // If string is empty.
	        if (str.length() == 0) { 
	            System.out.print(ans + " "); 
	            return;
	        } 
	  
	        for (int i = 0; i < str.length(); i++) { 
	        	 // ith character of string. 
	            char ch = str.charAt(i); 
	         // Rest of the string after excluding  
	            // the ith character 
	            String ros = str.substring(0, i) +  
	                         str.substring(i + 1); 
	            // Recurvise call 
	            printPermutn(ros, ans + ch); 
	        } 
	    } 
}
