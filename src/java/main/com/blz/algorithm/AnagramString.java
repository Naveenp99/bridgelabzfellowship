package com.blz.algorithm;

import java.io.IOException;

import com.blz.algorithm.utils.AlgorithmUtility;
import com.blz.utils.InputUtility;

public class AnagramString {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter the String s1: ");
		String s1=InputUtility.stringVal();
		System.out.println("Enter the String s2: ");
		String s2=InputUtility.stringVal();
		System.out.println(AlgorithmUtility.isAnagramString(s1,s2));
	}
}

