package com.bridgelabz.datastructure.base;
import java.util.Scanner;
import com.bridgelabz.utility.Stack;

public class PrimeAnagramUsingStack<T> {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn=new Scanner(System.in);
		   System.out.println("Enter the number of c: ");
		   int c=scn.nextInt();
		   System.out.println("Enter the number of d: ");
		   int d=scn.nextInt();
				int a=c;
				int b=d;
				System.out.println("prime anagrams are: ");
				primeRange(a,b);
	}
				// Find the Prime Range for the given Input.
	public static void primeRange(int a,int b) {
		Stack<Integer> stack=new Stack<Integer>();  //creating stack object to store the result
		int[][] arr1=new int[a+1][b+1];   //Creating TwoDArray to store elements.	
		for(int i=a;i<=b;i++) {
					if(i==1||i==0||i<9) continue;
					int flag=0;
					for(int j=2;j<=i/2;j++) {
						if(i%j==0) {
							flag=1;
							break;
						}
					}
					if(flag==0) {
						if(anagram(i)==1) {    //calling anagram() method to reverse the number
							arr1[a][b]=reverse(i);	   //Storing result in an Array.
							stack.push(arr1[a][b]);
						}
						}
				}
					stack.display();
				}

	//To check the number is Prime or Not.
		//If it Prime return 1 else return 0.
	public static int primeNumber(int num) {
		   if(num<=1)  return 0;
				for(int k=2;k<=num/2;k++) {
					if(num%k==0) {
						return 0;
					}
				}
					return 1;	
			}
			
			public static int reverse(int num) {
				int rev=0;  //Initialized Reverse=0.
				while(num>0) {
				int rem=num%10;    //Store the Reminder in Variable. 
				rev=rev*10+rem;   //Storing the value of variable.
				num/=10;   //Divide the number to get Quotient.
				}
				return rev;   //return the reverse number. 
			}
			public static int anagram(int number) {
				int rev=0;
				while(number>0) {
				int rem=number%10;
				rev=rev*10+rem;
				number/=10;
				}
					return primeNumber(rev);
			}
}
