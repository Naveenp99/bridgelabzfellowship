package com.blz.algorithm;

import com.blz.algorithm.utils.AlgorithmUtility;
import com.blz.utils.InputUtility;

public class PrimePalindrome {

	public static void main(String[] args) {
		System.out.println("Enter the Low Range: ");
		int low=InputUtility.intVal();
		System.out.println("Enter the High Range: ");
		int high=InputUtility.intVal();
		for(int i=low;i<=high;i++) {
			if(i==0||i==1) continue; 
			int flag = 0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {          
					flag=1;       
					break;         
				}
			}
			if(flag==0) {         
			if(i==AlgorithmUtility.reverseNumber(i)) {  
				System.out.print(i+" "); 
			}
		}
		}
}
}
