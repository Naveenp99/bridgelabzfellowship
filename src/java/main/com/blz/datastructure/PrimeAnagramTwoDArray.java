package com.blz.datastructure;

import com.blz.datastructure.utils.DatastructureUtility;
import com.blz.utils.InputUtility;

public class PrimeAnagramTwoDArray {

	public static void main(String[] args) {
		   System.out.println("Enter the low Range: ");
		   int low=InputUtility.intVal();
		   System.out.println("Enter the High Range: ");
		   int high=InputUtility.intVal();
		   DatastructureUtility.primeRange(low, high);
		}
	}
	

