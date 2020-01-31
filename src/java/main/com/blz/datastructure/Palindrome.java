package com.blz.datastructure;

import java.io.IOException;

import com.blz.datastructure.utils.DatastructureUtility;
import com.blz.utils.InputUtility;

public class Palindrome<T> {

	public static void main(String[] args) throws IOException {    
			System.out.println("Enter a String: ");
			String s=InputUtility.stringVal();
			System.out.println(DatastructureUtility.isPalindrome(s));
	}
}
