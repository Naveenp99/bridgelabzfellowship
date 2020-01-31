package com.blz.basic;

import com.blz.utils.InputUtility;

public class PrimeFactors {

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		int number=InputUtility.intVal();
		for(int i=2;i<number;i++) {  
			while(number%i==0) {     
				System.out.print(i+" "); 
				number/=i;         
			}
		}
		if(number>2)
			System.out.print(number); 
	}
}
