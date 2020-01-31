package com.blz.basic;

import java.io.IOException;

import com.blz.basic.utils.BasicUtility;
import com.blz.utils.InputUtility;

public class ReplaceString {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the String: ");
		String string = InputUtility.stringVal();
		System.out.println("Enter the Word you want to Replace: ");
		String replaceWord = InputUtility.stringVal();
		System.out.println("Enter the Word: ");
		String word = InputUtility.stringVal();
		System.out.println("Replaced String is: "+BasicUtility.replaceString(string,replaceWord,word));
	}
}

