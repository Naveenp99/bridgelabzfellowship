package com.blz.datastructure;

import com.blz.datastructure.utils.DatastructureUtility;
import com.blz.utils.InputUtility;

public class PrimeTwoDArray {

	 public static void main(String[] args) {
		   System.out.println("Enter the low Range: ");
		   int low=InputUtility.intVal();
		   System.out.println("Enter the High Range: ");
		   int high=InputUtility.intVal();
		   while(low<=901 && high<=1000) {
			   System.out.print("arr["+low+"]"+"["+high+"]"+": ");
			   System.out.println(DatastructureUtility.primeRangeTOArray(low,high));  
		   System.out.println();
		   low=high+1;
		   high+=100;
	   }
	   }
}
