package com.bridgelabz.basiccoreprograms;

public class ReplaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Calling Static Parameterized Method in main Method.
		replaceString("C++ is one of the Programming language");
	}
	public static void replaceString(String s) 
	{
//By Using Replace() method we can do the replace of String.
	String result=s.replace("C++","JAVA");  
	System.out.println(result);   //Display the Result.
	}
	}
