package com.bridgelabz.algorithmprograms;
import java.util.*;
public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String s1: ");
		String s1=scn.nextLine();
		System.out.println("Enter the String s2: ");
		String s2=scn.nextLine();
		System.out.println(isAnagramString(s1,s2));
		scn.close();
	}
	public static boolean isAnagramString(String s1,String s2) {
		boolean status=true;
		// If length of both strings is not same, 
        // then they cannot be anagram 
		if(s1.length()!=s2.length()) {
			status=false;
		}
		else {
			char[] Array1=s1.toLowerCase().toCharArray();
			char[] Array2=s2.toLowerCase().toCharArray();
			 // Sort both strings 
			Arrays.sort(Array1);
			Arrays.sort(Array2);
			 // Compare sorted strings using equals() character by character.
			status=Arrays.equals(Array1, Array2);
		}
		if(status) 
			return true;
		else
			return false;
	}
}
