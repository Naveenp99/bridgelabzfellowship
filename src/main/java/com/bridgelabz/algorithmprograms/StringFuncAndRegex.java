package com.bridgelabz.algorithmprograms;
import java.util.regex.*;
import java.util.*;
public class StringFuncAndRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=scn.nextLine();
		//Calling Static Parameterized Methods in main Method.
		fullName(s);
		date(s); 
		mobileNumber(s);
	}
	public static void fullName(String s) {
		//By Using Replace() method we can do the replace of String.
		String name=s.replace("XYZABCD", "ABCDEFG");
		System.out.println(name);    //Display the Result.
	}
	public static boolean date(String s) {
		Pattern p=Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");  //Here it Compiling the Date Format Pattern.
		Matcher m=p.matcher("12-03-1957");  //It Check the Date Format Pattern. 
		boolean b=m.matches();  //It Matches the Date Format Pattern.
		System.out.println(b);     //Display the Result in Boolean.
		return b;
	}
	public static boolean mobileNumber(String s){
		Pattern p=Pattern.compile("^\\d{2}-\\d{10}$");  //Here it Compiling the MobileNumber Format Pattern.
		Matcher m=p.matcher("91-9876543210");    //It Check the MobileNumber Format Pattern. 
		boolean b=m.matches();  //It Matches the MobileNumber Format Pattern.
		System.out.println(b);    //Display the Result in Boolean.
		return b;
	}
}
