package com.bridgelabz.algorithmprograms;
import java.util.regex.*;
import java.util.*;
public class StringFuncAndRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=scn.nextLine();
		fullname(s);
		date(s); 
		mobilenumber(s);
	}
	public static void fullname(String s) {
		String name=s.replace("XYZABCD", "ABCDEFG");
		System.out.println(name);
	}
	public static boolean date(String s) {
		Pattern p=Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
		Matcher m=p.matcher("12-03-1957");
		boolean b=m.matches();
		System.out.println(b);
		return b;
	}
	public static boolean mobilenumber(String s){
		Pattern p=Pattern.compile("^\\d{2}-\\d{10}$");
		Matcher m=p.matcher("91-9876543210");
		boolean b=m.matches();
		System.out.println(b);
		return b;
	}
}
