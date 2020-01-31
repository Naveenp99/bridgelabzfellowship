package com.blz.datastructure;

import com.blz.datastructure.utils.DatastructureUtility;
import com.blz.utils.InputUtility;

public class PrimeAnagramUsingStack<T> {
	public static void main(String[] args) {
	   System.out.println("Enter the number of c: ");
	   int c=InputUtility.intVal();
	   System.out.println("Enter the number of d: ");
	   int d=InputUtility.intVal();
			int a=c;
			int b=d;
			System.out.println("prime anagrams are: ");
			DatastructureUtility.primeRangeStack(a,b);
}
}
