package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class CouponNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number n: ");
		int n=scn.nextInt();
		int count=collect(n);
		System.out.println(count);
		scn.close();
			}
		public static int getCoupon(int n) {
			return (int) (Math.random()*n);
		}
		public static int collect(int n) {
			boolean[] isCollected=new boolean[n];
			int count=0;
			int distinct=0;
			while(distinct<n) {
				int value=getCoupon(n);
				count++;
				if(!isCollected[value]) {
					distinct++;
					isCollected[value]=true;
				}
			}
			return count;
	}
}
