package com.blz.functional.utils;

import com.blz.utils.InputUtility;

public class FunctionalUtility {
	/**
	 * @param a
	 * @return
	 * Checking Triplets are Found or Not.
	 */
	public static String sumOfThreeInt(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				for (int k = j + 1; k < a.length; k++) {
					if (a[i] + a[j] + a[k] == 0) {
						return "triplets are FOUND";
					}
				}
			}
		}
		return "triplets are NOT FOUND";
	}

	/**
	 * @param limit
	 * @param array
	 * @return
	 * Reading the Array Elements from the User.
	 */
	public static int[] getArrayElements(int limit, int[] array) {
		for (int m = 0; m < limit; m++) {
			array[m] = InputUtility.intVal();
		}
		return array;
	}

	/**
	 * @param t
	 * @param v
	 * @return
	 * Finding the WindChill Data using Formulas with Condition.
	 */
	public static double windChill(double t, double v) {
		if (t > 50 || v > 120 || v < 3)
			return -1;
		else {
			double wc = 35.74 + (0.6215 * t) + ((0.4275 * t) - 35.75) * Math.pow(v, 0.16);
			return wc;
		}
	}
	
	/**
	 * @param limit
	 * @param array
	 * @return
	 * Reading the Two Dimensional Array Elements from the User.
	 */
	public static int[][] getTwoDArray(int[][] array,int rows,int columns) {
		for(int i=0;i<rows;i++) {       
			for(int j=0;j<columns;j++) {
				array[i][j]=InputUtility.intVal();
			}
		}
		return array;
	}
	
	/**
	 * @param array
	 * @param row
	 * @param columns
	 * @return
	 * Displaying Two Dimensional Array.
	 */
	public static int[][] displayTwoDArray(int[][] array,int row,int columns) {
	for(int i=0;i<row;i++) {
		for(int j=0;j<columns;j++) {
			System.out.print(array[i][j]);
		}
		System.out.println();
}
	return array;
	}
	
	/**
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 * Finding the Value of Delta,Root1,Root2. 
	 */
	public static String quadratic(double a,double b,double c) {
		double delta;
		double root1;         
		double root2;
		delta=Math.pow(b, 2)-(4*a*c);         
		root1=(-b+Math.sqrt(delta))/(2*a);    
		root2=(-b-Math.sqrt(delta))/(2*a);     
		return "Delta ="+delta+", "+"Root1 ="+root1+", "+"Root2 ="+root2;  
	}
	
	/**
	 * @param x
	 * @param y
	 * @return
	 * Finding the Distance.
	 */
	public static double distance(int x,int y) {
		double distance=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));   
		return distance;                             
	}
	
	/**
	 * @param array
	 * @return
	 * Displaying Array Elements.
	 */
	public static int[] displayArrayElements(int[] array) {
		for(int i=0;i<array.length;i++) {
				System.out.print(array[i]+" ");
	}
		return array;
		}
	
}
