package com.blz.utils;

public class PracticeRecurFact {

	public static void main(String[] args) {
		
		System.out.print(fact(6));
	}
	
public static int fact(int num) {
		
		if(num == 0)
			return 1;
		if(num == 1)
			return 1;
		
		return fact(num-1) * num;
	}
	
}
