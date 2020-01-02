package com.bridgelabz.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.algorithmprograms.AnagramString;
import com.bridgelabz.algorithmprograms.BinarySearchWord;
import com.bridgelabz.algorithmprograms.BubbleSort;
import com.bridgelabz.algorithmprograms.FindUrNumber;
import com.bridgelabz.algorithmprograms.Generic;
import com.bridgelabz.algorithmprograms.InsertionSort;
import com.bridgelabz.algorithmprograms.MergeSort;
import com.bridgelabz.algorithmprograms.PrimeAnagram;
import com.bridgelabz.algorithmprograms.PrimeNumberRange;
import com.bridgelabz.algorithmprograms.PrimePalindrome;
import com.bridgelabz.basiccoreprograms.FlipCoins;
import com.bridgelabz.basiccoreprograms.HormonicNumber;
import com.bridgelabz.basiccoreprograms.LeapYear;
import com.bridgelabz.basiccoreprograms.PowerOfTwo;
import com.bridgelabz.basiccoreprograms.ReplaceString;
import com.bridgelabz.functionalprograms.Distance;
import com.bridgelabz.functionalprograms.SumOfThreeInt;
import com.bridgelabz.functionalprograms.WindChill;
import com.bridgelabz.junittesting.BinaryNibbles;
import com.bridgelabz.junittesting.Sqrt;
import com.bridgelabz.logicalprograms.CouponNumbers;

class TestCases {

	@Test
	void test1a() {
		boolean check=AnagramString.isAnagramString("silent", "listen");
		assertEquals(true,check);
	}
	void test1b() {
		boolean check=AnagramString.isAnagramString("keep", "PeEk");
		assertEquals(true,check);
	}
	void test2a() {
		String[] s= {"naveen","hanuma","seetha","rama"};
		BinarySearchWord.sort(s);
	BinarySearchWord.searching(s,"rama");
	}
	void test2b() {
		String[] s= {"krishna","bhima","arjuna","valmiki"};
		BinarySearchWord.sort(s);
	BinarySearchWord.searching(s,"bhima");
	}
	void test3() {
		int[] a= {8,7,9,4,2,0,1,5,3,6};
		BubbleSort.sort(a);
	}
	void test4() {
		int[] a= {8,7,9,4,2,0,1,5,3,6};
		InsertionSort.sort(a);
	}
	void test5() {
		int[] a= {8,7,9,4,2,0,1,5,3,6};
		MergeSort.sort(a);
	}
	void test6() {
		PrimeAnagram.primeRange(0, 100);
	}
	void test7() {
		PrimeNumberRange.primeNumberRange(0, 1000);
	}
	void test8() {
		PrimePalindrome.primeRange(0, 1000);
	}
	void test9() {
		FlipCoins.flipCoin(5);
		FlipCoins.flipCoins(5);
	}
	void test10() {
		HormonicNumber.harmonicNumber(3);
	}
	void test11a() {
		LeapYear.leapYear(2020);
	}
	void test11b() {
		LeapYear.leapYear(2000);
	}
	void test12a() {
		PowerOfTwo.powerOfTwo(5);
	}
	void test12b() {
		PowerOfTwo.powerOfTwo(4);
	}
	void test13a() {
		Distance.distance(5,4);	
	}
	void test13b() {
		Distance.distance(7,3);	
	}
	void test14() {
		int[] a= {0,1,-1,4,5,-9};
		SumOfThreeInt.sumOfThreeInt(a);
	}
	void test15a() {
		WindChill.windChill(49, 119);
	}
	void test15b() {
		WindChill.windChill(94, 191);
	}
	void test16a() {
		BinaryNibbles.binaryNibbles(55);
	}
	void test16b() {
		BinaryNibbles.binaryNibbles(100);
	}
	void test17a() {
		Sqrt.sqRoot(9);
	}
	void test17b() {
		Sqrt.sqRoot(16);
	}
	void test18() {
		CouponNumbers.collect(1000);
	}
}
