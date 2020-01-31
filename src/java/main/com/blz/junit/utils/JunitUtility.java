package com.blz.junit.utils;


public class JunitUtility {

	/**
	 * @param x
	 * @return
	 * Finding the Binary Nibbles.
	 */
	public static int binaryNibbles(int x) {	
				return ((x & 0x0F)<<4 | (x & 0xF0)>>4);
			}
	
	/**
	 * @param m
	 * @param d
	 * @param y
	 * @return
	 * Finding the Day of the Week.
	 */
	public static int dayOfWeek(int m,int d,int y) {
		int y0=y-(14-m)/12;                 
		int x=y0+(y0/4)-(y0/100)+(y0/400); 
		int m0=m+12*((14-m)/12)-2;          
		int d0=(d+x+(31*m0)/12)%7;        
		return d0;
	}
	
	/**
	 * @param amount
	 * @return
	 * Finding the Fewest Notes in the given Amount.
	 */
	public static String fewestNotes(int amount) {
		int[] a= {1000,500,100,50,10,5,2,1};   
		int[] count=new int[a.length];
		for(int i=0;i<a.length;i++) {
			if(amount>=a[i]) {
				count[i]=amount/a[i];
				amount=amount-count[i]*a[i];
			}
		}		
	     for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" is "+count[i]);
		}
		return a+" is "+count;
	}
	
	/**
	 * @param P
	 * @param Y
	 * @param R
	 * @return
	 * Finding the Payment for Monthly.
	 */
	public static String monthlyPayment(double P,double Y,double R) {
		double n=12*Y;      
		double r=R/(1200);  	
		double Payment=P*r/(1-Math.pow(1+r,-n));
		return "Payment is: "+Payment;
	}
	
	/**
	 * @param c
	 * @return
	 * Finding the Square Root for the Given Number.
	 */
	public static double sqRoot(double c) {
		double t=c;                
		double epsilon=1e-15;    
		while(Math.abs(t-(c/t))>epsilon*t) {
			t=(c/t+t)/2.0;         
		}
		return t;
	}
	
	/**
	 * @param C
	 * @return
	 * Converting Temperature from celsiusTofahrenheit.
	 */
	public static String celsiusTofahrenheit(double C) {
		double F=(C*9/5)+32;    
		return "fahrenheit F is: "+F;
	}
	
	/**
	 * @param F
	 * @return
	 * Converting Temperature from fahrenheitTocelsius.
	 */
	public static String fahrenheitTocelsius(double F) {
		double C=(F-32)*5/9;   
		return "Celsius C is: "+C;
	}
	
	/**
	 * @param number
	 * @return
	 * Converting Decimal to Binary.
	 */
	public static int toBinary(int number){
		int index=0;
		int[] b=new int[25]; 
		while(number>0) {
			int rem=number%2;    
			b[index++]=rem;   
			number/=2;        
		}
		int result = 0; 
		for(int i=index-1;i>=0;i--) {  
		result = (result*10)+b[i];
		}
		return result;
	}
	
}
