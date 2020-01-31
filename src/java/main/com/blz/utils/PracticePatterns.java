package com.blz.utils;

public class PracticePatterns {

	public static void main(String[] args) {

		int row = 27;
		int space = 15;
		int stars = 1;
		for (int i = 1; i <= row; i++) {

			for (int j2 = 1; j2 <= space; j2++) {
				System.out.print(" ");
			}
			for (int j3 = 1; j3 <= stars; j3++) {
				System.out.print("/");
			}

			System.out.println();
			if (i <= (row / 2)-1) {
				stars += 2;
				space--;
			}

			else {
				stars -= 2;
				space++;
			}

		}

	}
}
