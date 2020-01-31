package com.blz.junit;

import com.blz.junit.utils.JunitUtility;
import com.blz.utils.InputUtility;

public class FewestNotes {

	public static void main(String[] args) {
		System.out.println("Enter the amount: ");
		int amount=InputUtility.intVal();
		JunitUtility.fewestNotes(amount);   
	}
}
