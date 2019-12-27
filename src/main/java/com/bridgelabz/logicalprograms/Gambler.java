package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class Gambler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number stakes: ");
		int stakes=scn.nextInt();
		System.out.println("Enter the number N: ");
		int N=scn.nextInt();
		gambler(stakes,N);
		scn.close();
	}
	public static void gambler(int stake,int N) {
		int win=0;
		int loss=0;
		while(stake>0) {
			if(win==1) {
				return;
			}
		for(int i=0;i<N;i++) {

			if(Math.random()<0.5) { 
				win++;
				stake++;
			}
				else {
			loss++;
			stake--;
				}
		}
		stake-=loss;
		}
			System.out.println("Number of WIN is: "+win);
			System.out.println("Percentage of WIN and LOSS is: "+win*100/N+" and "+loss*100/N);
	}
}
