package com.blz.algorithm.utils;

import java.io.IOException;
import java.util.Arrays;
import com.blz.utils.InputUtility;

public class AlgorithmUtility {

	/**	  
	 @param s1
	 @param s2
	 */
	public static boolean isAnagramString(String s1,String s2) {
		boolean status=true;
		if(s1.length()!=s2.length()) {
			status=false;
		}
		else {
			/**
	    * convert to Lower Case and to Char Array.
			 */
			char[] Array1=s1.toLowerCase().toCharArray();
			char[] Array2=s2.toLowerCase().toCharArray();
			/**
		* sort the two Arrays and Checking if they are equal or Not.
			 */
			Arrays.sort(Array1);
			Arrays.sort(Array2);
			status=Arrays.equals(Array1, Array2);
		}
		if(status) 
			return true;
		else
			return false;
	}
	/**  
	 * @param string
	 * @throws IOException
	 
	 * Reading String Array Elements from User.
	 */
	public static String[] getStringArray(String[] string) throws IOException {
	for(int i=0;i<string.length;i++) {
		 string[i]=InputUtility.stringVal();
		}
	return string;
	}
	
	/**
	 * @param string
	 * Sort the String Array using CompareTo Method.
	 */
	public static void sortWord(String[] string) {   
		for(int i=0;i<string.length;i++) {
			for(int j=i+1;j<string.length;j++) {
			if(string[i].compareTo(string[j])>0) {  
				String temp=string[i];   
				string[i]=string[j];
				string[j]=temp;
			}
		}
	}
	}
	
	/**
	 * @param string
	 * Sort the String Array using Logical Operators.
	 */
	public static int[] bubbleSort(int[] array) {
		for(int i=0;i<array.length;i++) {  
			for(int j=0;j<array.length-1-i;j++) {   
				if(array[j]>array[j+1]) { 
					int temp=array[j];   
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		return array;
	}
	
	public static int[] insertionSort(int[] array) {
		for(int i=1;i<array.length;i++) {  
			int key=array[i];   
			int j=i-1;     
			while(j>=0 && array[j]>key) { 
				array[j+1]=array[j];  
				j--;
			}
			array[j+1]=key;
		}
		return array;
	}
	
	public static void mergeSort(int[] a) {
		if(a.length==1) return; 
		int[] l=new int[a.length/2];      
		int[] r=new int[a.length-l.length];
		int i;
		for(i=0;i<l.length;i++) {
			l[i]=a[i];   
		}
		for(int j=0;j<r.length;j++) {
			r[j]=a[i];     
			i++;
		}
		mergeSort(l);    
		mergeSort(r);     
	merge(l,r,a);  
	}
	
	public static void merge(int[] a,int[] b,int[] c) {
		int i=0;  
		int j=0;     
		int k=0;   
		while(i<a.length && j<b.length) {
			if(a[i]<b[j])  
				c[k++]=a[i++];  
			else
				c[k++]=b[j++];  
		}
		while(i<a.length) {
			c[k++]=a[i++];       
		}
		while(j<b.length) {
			c[k++]=b[j++];
		}
	}
	
	/**
	 * @param string
	 * @return
	 * to Display the String Array.
	 */
	public static String[] displayStringArray(String[] string) {
	for(int i=0;i<string.length;i++) {
		System.out.print(" "+string[i]);
	}
	return string;
	}
	
	/**
	 * 
	 * @param string
	 * @param key
	 * @return
	 * In the String Array Searching if Key is Found or Not.
	 */
	public static String searching(String[] string,String key) {
		for(int i=0;i<string.length;i++) {
			if(key.equals(string[i])) {   
				return "Word is FOUND";
			}	
		}
				return "Word is NOT FOUND";
		}
	
	/**
	 * 
	 * @param low
	 * @param high
	 * @return
	 * Finding the Magic Number.
	 */
	public static int magicNumber(int low,int high) {
		while(low!=high) {      
			int mid=(low+high)/2;  
			System.out.println("Enter the number 1 if range in between "+low+" to "+mid+" else "+"Enter the number 2 if range in between "+(mid+1)+" to "+high);	
			int select=InputUtility.intVal();
			if(select==1)  { 
				high=mid;
			}
			else if(select==2) {
				low=mid+1;     
			}
			}
			return high;  	
}
	
	/**
	 * @param num
	 * @return
	 * Checking the given number is Prime Or Not, if Prime return 1 else return 0.
	 */
	public static int checkPrimeNumber(int num) {
		   if(num<=1)  return 0;
				for(int k=2;k<=num/2;k++) {    
					if(num%k==0) {             
					return 0;               
					}
				}
					return 1;	      
			}
	
	/**
	 * @param number
	 * @return
	 * Reverse the given Prime Number.
	 */
	public static int reversePrime(int number) {
		int rev=0;   
		while(number>0) {
		int rem=number%10;  
		rev=rev*10+rem;   
		number/=10;    
		}
			return checkPrimeNumber(rev);
	}
	
	/**
	 * @param low
	 * @param high
	 * Finding the Prime Number Range.
	 */
	public static void primeRange(int low,int high) {
		for(int i=low;i<=high;i++) {
			if(i==1 || i==0) continue;  
			int flag = 1;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {       
					flag = 0;
					break;       
				}
			}   
			if(flag == 1)
				System.out.print(i+" "); 
		}
	}
	
	/**
	 * @param number
	 * @return
	 * Reverse the given Prime Number.
	 */
	public static int reverseNumber(int number) {
		int rev=0; 
		while(number>0) {
		int rem=number%10;   
		rev=rev*10+rem;   
		number/=10;   
		}
		return rev;   
	}
	
}
