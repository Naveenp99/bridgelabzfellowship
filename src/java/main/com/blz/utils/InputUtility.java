package com.blz.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputUtility {

	private final static Scanner sc = new Scanner(System.in);
	private final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
	public static int intVal() {
		return sc.nextInt();
	}

	public static boolean intBool() {
		return sc.nextBoolean();
	}

	public static double doubleVal() {
		return sc.nextDouble();
	}
	
	public static String stringVal() throws IOException {
		return br.readLine();
	}

	public static long longVal() {
		return sc.nextLong();
	}
	
}