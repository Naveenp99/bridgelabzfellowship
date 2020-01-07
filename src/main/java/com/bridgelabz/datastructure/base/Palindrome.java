package com.bridgelabz.datastructure.base;

import java.util.*;

   public class Palindrome<T> {
	public static void main(String[] args) {    
		 Scanner scn=new Scanner(System.in);
			System.out.println("Enter a String: ");
			String s=scn.nextLine();
			Palindrome<String> pal=new Palindrome<String>();
			System.out.println(pal.isPalindrome(s));
	}
 // If data is Palindrome it will returns True else False.	
	public boolean isPalindrome(T s) {
		if(s.equals(reverse(s)))  return true;
		else   return false;
	}
	//To find Reverse of the String.
	public T reverse(T s) {
		String reverse="";    //Initialized reverse is null.
		// DownCasting to String.
		 for(int i=((String) s).length()-1;i>=0;i--)
		 {
			 reverse+=((String) s).charAt(i);
		 }
		 return (T) reverse;
	}
}
