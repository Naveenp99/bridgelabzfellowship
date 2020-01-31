package com.blz.algorithm;

import com.blz.algorithm.utils.AlgorithmUtility;
import com.blz.utils.InputUtility;

public class PrimeAnagram {
	public static void main(String[] args) {
		System.out.println("Enter the Low Range: ");
		int low=InputUtility.intVal();
		System.out.println("Enter the High Range: ");
		int high=InputUtility.intVal();
		for(int i=low;i<=high;i++) {
			if(i==1||i==0) continue;
			int flag=0;          
			for(int j=2;j<=i/2;j++) {   
				if(i%j==0) {     
					flag=1;       
					break;         
				}
			}
			if(flag==0) {        
				if(AlgorithmUtility.reversePrime(i)==1)
				System.out.print(i+" ");    
		}
		}
	}
}
