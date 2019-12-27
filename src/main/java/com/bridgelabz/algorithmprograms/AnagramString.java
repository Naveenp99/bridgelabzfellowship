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
		isAnagram(s1,s2);
		scn.close();
	}
	public static void isAnagram(String s1,String s2) {
		boolean status=true;
		if(s1.length()!=s2.length()) {
			status=false;
		}
		else {
			char[] Array1=s1.toLowerCase().toCharArray();
			char[] Array2=s2.toLowerCase().toCharArray();
			Arrays.sort(Array1);
			Arrays.sort(Array2);
			status=Arrays.equals(Array1, Array2);
		}
		if(status) 
			System.out.println(s1+" and "+s2+" are Anagrams");
		else
			System.out.println(s1+" and "+s2+" are NOT Anagrams");
	}
}
