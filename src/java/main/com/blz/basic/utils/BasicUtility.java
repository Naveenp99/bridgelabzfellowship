package com.blz.basic.utils;

public class BasicUtility {

	/**
	 * @param num
	 * @return
	 * Finding the Percentage of Head and Tail.
	 */
	public static String flipCoin(int num)
	{
		int headCount=0;  
		int tailCount=0;  
		for(int i=0;i<num;i++) {
		if(Math.random()<0.5)
			headCount++;    
		else
			tailCount++;    
	}
		return "Tail and Head Percentage is: "+(tailCount*100)/num+", "+(headCount*100)/num;  
	}
	
	/**
	 * @param N
	 * @return
	 * Finding the HarmonicNumber.
	 */
	public static double harmonicNumber(int N)
	{
		double sum=0.0;     
		for(int i=1;i<=N;i++) 
		{
			sum+=1.0/i;
		}
			return sum;  
	}
	
	/**
	 * @param year
	 * @return
	 * Checking the given Year is LeapYear or Not.
	 */
	public static boolean leapYear(int year)
	{	
		if(year%400==0 || (year%4==0 && year%100!=0))
			return true;
		else
			return false;
	}
	
	/**
	 * @param number
	 * @return
	 * Finding the Power of Two Numbers.
	 */
	public static int powerOfTwo(int number)
	{
		int i=1; 
		int	power=1;  
		while(i<=number)
		{
			power=2*power;  
			i++;   
		}
		return power;
	}
	
	/**
	 * @param string
	 * @param replaceWord
	 * @param word
	 * @return
	 * Calling the replace() Method to Replace Word.
	 */
	public static String replaceString(String string,String replaceWord,String word) 
	{
	String result=string.replace(replaceWord,word);  
      return result; 
	}
	
}
