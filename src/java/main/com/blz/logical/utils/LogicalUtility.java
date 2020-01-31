package com.blz.logical.utils;

public class LogicalUtility {

	/**
	 * @param stake
	 * @param N
	 * @return
	 * Finding the Percentage of Number of Wins and Number of Loses.
	 */
	public static String gambler(int stake,int N) {
		int win=0;            
		int loss=0;         
		while(stake>0) {    
			if(win==1) {
				return null;
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
			return "Number of WIN is: "+win+" and Percentage of WIN and LOSS is: "+win*100/N+", "+loss*100/N;
	}
	
	
	
}
