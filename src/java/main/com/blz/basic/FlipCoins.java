package com.blz.basic;

import com.blz.basic.utils.BasicUtility;
import com.blz.utils.InputUtility;

public class FlipCoins {

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		int num=InputUtility.intVal();
		System.out.println(BasicUtility.flipCoin(num));
	}
}
