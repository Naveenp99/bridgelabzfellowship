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
		int win=0;            //Initializes a win.
		int loss=0;          //Initializes a loss.
		while(stake>0) {    //Assuming his/her Stake is Greater Than ZERO.
			if(win==1) {
				return;
			}
		for(int i=0;i<N;i++) {   //Playing the Game UpTo N Times.
 
//Math.random() is Lies between 0 to 1.
//If Player WINs then this below Condition will Work.
			if(Math.random()<0.5) { 
				win++;    
				stake++;   
			}
			
//Else this below Condition will Work.		
				else {
			loss++;
			stake--;
				}
		}
//For One Iteration Stake is Stake-Loss.		
		stake-=loss;
		}
		
//Finally Print the result.	
			System.out.println("Number of WIN is: "+win);
			System.out.println("Percentage of WIN and LOSS is: "+win*100/N+" and "+loss*100/N);
	}
}
