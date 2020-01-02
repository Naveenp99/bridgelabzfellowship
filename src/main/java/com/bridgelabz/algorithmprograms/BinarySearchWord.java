package com.bridgelabz.algorithmprograms;
import java.io.*;
import java.util.*;
public class BinarySearchWord {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
//using BufferedReader() to convert integer into Strings.
		BufferedReader scn=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of n: ");
		int n=Integer.parseInt(scn.readLine());
		String[] s= new String[n];
		System.out.print("Enter the strings: ");
		for(int i=0;i<n;i++) {
			System.out.print("\nEnter the strings of"+i);
			 s[i]=scn.readLine();
			}
		System.out.println("Entered strings are: ");
		for(int i=0;i<n;i++) {
			System.out.print(" "+s[i]);
		}
		//Calling Static Parameterized Methods in main Method.
	sort(s);
	System.out.print("\nSorted order is:\n");
	for(String sorted:s) 
		System.out.print(sorted+" ");
	System.out.println("\nEnter the String: ");
	String key=scn.readLine();
	//Calling Static Parameterized Methods in main Method.
	System.out.println(searching(s,key));
	scn.close();	
	}
	public static void sort(String[] s) {   //Sorting the words.
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
			if(s[i].compareTo(s[j])>0) {  //Using compareTo() method
				String temp=s[i];   //Swaping using Third variable.
				s[i]=s[j];
				s[j]=temp;
			}
		}
	}
	}
	public static String searching(String[] s,String key) {
	for(int i=0;i<s.length;i++) {
		if(key.equals(s[i])) {   //Comparing key using equals() methods character by character.
			return "Word is FOUND";
		}	
	}
			return "Word is NOT FOUND";
	}
}