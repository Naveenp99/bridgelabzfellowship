package com.bridgelabz.utility;

public class PrimeAnagram {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/

	public static int primeNumber(int num) {
		   if(num<=1)  return 0;
				for(int k=2;k<=num/2;k++) {    //0 and 1 is NOT a Prime Numbers.
					if(num%k==0) {             //Checking number is Divisible by k. 
					return 0;                //If it is Divide then it is Not a Prime Number.
					}
				}
					return 1;	      //If it is NOT Divide then it is a Prime Number.
			}
			public static void primeRange(int a,int b) {
				for(int i=a;i<=b;i++) {
					if(i==1||i==0) continue;
					int flag=0;           //Creating Flag for Our reference.
					for(int j=2;j<=i/2;j++) {   
						if(i%j==0) {     //Checking i is Divisible by j.  
							flag=1;         //If it is Divide then it is Not a Prime Number.
							break;         // And Flag become 1.
						}
					}
					if(flag==0) {          //If it is NOT Divide then it is a Prime Number.
						if(anagram(i)==1)
						System.out.print(i+" ");    //Display the Final Output.
				}
				}
			}
			public static int anagram(int number) {
				int rev=0;    //Initialized Reverse=0.
				while(number>0) {
				int rem=number%10;   //Store the Reminder in Variable. 
				rev=rev*10+rem;    //Storing the value of variable.
				number/=10;    //Divide the number to get Quotient.
				}
					return primeNumber(rev);
			}
}
