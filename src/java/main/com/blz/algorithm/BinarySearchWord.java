package com.blz.algorithm;

import java.io.IOException;
import com.blz.algorithm.utils.AlgorithmUtility;
import com.blz.utils.InputUtility;

public class BinarySearchWord {

	public static void main(String[] args)throws IOException {

		System.out.println("Enter the number of Strings: ");
		int n= Integer.parseInt(InputUtility.stringVal());
		String[] string= new String[n];
		System.out.print("Enter the strings: ");
		string = AlgorithmUtility.getStringArray(string);
		System.out.println("Entered strings are: ");
		AlgorithmUtility.displayStringArray(string);
	AlgorithmUtility.sortWord(string);
	System.out.print("\nSorted order is:\n");
	for(String sorted:string) 
		System.out.print(sorted+" ");
	System.out.println("\nEnter the String: ");
	String key=InputUtility.stringVal();
	System.out.println(AlgorithmUtility.searching(string,key));
	}
}
