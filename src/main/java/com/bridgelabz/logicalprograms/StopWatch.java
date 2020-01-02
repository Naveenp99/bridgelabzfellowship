package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class StopWatch {
	private final long start;
	public StopWatch() {        
	start=System.currentTimeMillis();  //Initializes a new stopWatch.
	}                                 //Time in milliseconds.
	
	public double elapsedTime() {
		long now=System.currentTimeMillis(); //Returns the elapsed CPU time in milliseconds. 
		                                    //since the stopWatch was created.
		return (now-start)/1000.0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number n: ");
		int n=scn.nextInt();
// sum of square roots of integers from 1 to n using Math.sqrt(x).
		StopWatch timer1=new StopWatch();
		double sum1=0.0;
		for(int i=1;i<=n;i++) {
			sum1+=Math.sqrt(i);
		}
		double time1=timer1.elapsedTime();
		System.out.println("sum1"+","+"time1 is: "+sum1+","+time1);
		
//sum of square roots of integers from 1 to n using Math.pow(x, 0.5).
		StopWatch timer2=new StopWatch();
		double sum2=0.0;
		for(int i=1;i<=n;i++) {
			sum2+=Math.pow(i,0.5);
		}
		double time2=timer2.elapsedTime();
		System.out.println("sum2"+","+"time2 is: "+sum2+","+time2);
		scn.close();
	}
}
