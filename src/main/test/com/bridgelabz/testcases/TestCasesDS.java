package com.bridgelabz.testcases;


import org.junit.jupiter.api.Test;

import com.bridgelabz.datastructure.base.Palindrome;
import com.bridgelabz.datastructure.base.PrimeAnagramTwoDArray;
import com.bridgelabz.datastructure.base.PrimeAnagramUsingQueue;
import com.bridgelabz.datastructure.base.PrimeAnagramUsingStack;
import com.bridgelabz.datastructure.base.PrimeTwoDArray;

class TestCasesDS {

	@Test
	void test1a() {
		Palindrome<String> pal=new Palindrome<String>();
		System.out.println(pal.isPalindrome("MaDaM"));
	}
	void test1b() {
		Palindrome<String> pal=new Palindrome<String>();
		System.out.println(pal.isPalindrome("AbcCba"));
	}
    void test2a(){
		PrimeAnagramTwoDArray.primeRange(0, 1000);
	}
	void test2b(){
		PrimeAnagramTwoDArray.primeRange(300, 700);
	}
	void test3a(){
		PrimeAnagramUsingQueue.primeRange(0, 500);
	}
	void test3b(){
		PrimeAnagramUsingQueue.primeRange(1, 2000);
	}
	void test4a(){
		PrimeAnagramUsingStack.primeRange(1, 650);
	}
	void test4b(){
		PrimeAnagramUsingStack.primeRange(200, 950);
	}
	void test5a(){
		PrimeTwoDArray.primerange(0, 1000);
	}
	void test5b(){
		PrimeTwoDArray.primerange(900, 1000);
	}
}
