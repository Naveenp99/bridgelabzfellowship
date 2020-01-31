package com.blz.utils;

public class PracticePrimeAnagram {

	public static void main(String[] args) {
		range(0, 1000);
	}
	
	public static void range(int low, int high) {
		for (int i = low; i < high; i++) {
			if(i == 0 || i == 1)
				continue;
			int flag =1;
			for (int j = 2; j <= i/2; j++) {
				if(i%j == 0) {
				flag =0;
					break;
				}
			}
			if(flag == 1) {
				if(reverse(i) == 1) {
					if(revERSE(i) == i)
					continue;	
					else
				 System.out.print(i+" ");
				}
			}
		}
	}
	
	public static int reverse(int number) {
		int reverse = 0;
		while(number > 0) {
			int rem = number%10;
			reverse = (reverse*10) + rem;
			number/=10;
		}
		return isPrime(reverse);
	}
	
	public static int isPrime(int number) {
		for (int i = 2; i <= number/2; i++) {
			if(number%i == 0) 
				return 0;
		}
		return 1;
	}

	public static int revERSE(int number) {
		int reverse = 0;
		while(number > 0) {
			int rem = number%10;
			reverse = (reverse*10) + rem;
			number/=10;
		}
		return reverse;
	}
	
}
