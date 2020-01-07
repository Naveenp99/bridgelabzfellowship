package com.bridgelabz.datastructure.base;
import com.bridgelabz.utility.*;
import java.util.Scanner;

public class BankingCashCounter<T> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn=new Scanner(System.in);
		   System.out.println("Enter the Total Amount: ");
		   int Amount=scn.nextInt();
		   cashCount(Amount);
		   scn.close();
	}
public static void cashCount(int Amount) { 
	Queue<Integer> queue1=new Queue<Integer>();
	
	Scanner scn=new Scanner(System.in);
	int Persncount=0;

	while(Amount>0) {
		System.out.println("Enter the number 1 to Deposit the Money"
				+ " and Enter the number 2 to Withdraw the Money"
				+ " and Enter the number 3 to Check the CurrentMoney");
		
		   System.out.println("Enter the Number: ");
		   int choose=scn.nextInt();	
		   if(choose==1) {
			   System.out.println("Enter the Deposit Amount: ");
			   int Deposit=scn.nextInt();
			   Amount+=Deposit;
			   System.out.println("Remaining Total Amount is: "+Amount); 
			   queue1.enqueue(Persncount++);
			  
		   }
		   else if(choose==2) {
			   System.out.println("Enter the Withdrawal Amount: ");
			   int WithDraw=scn.nextInt();
			   Amount-=WithDraw;
			   System.out.println("Remaining Total Amount is: "+Amount);  
			   queue1.enqueue(Persncount++);
			   
		   }
		   else if(choose==3) {
			   System.out.println("The Current Amount is: "+Amount);
		   }
		   else {
			   System.out.println("Choose Currect Key");
		   }
		   
	}
	System.out.println("Amount is InSufficient ");
	System.out.println("\nNumber of Persons who Deposited and WithDrawn: ");
	 queue1.dequeue();
	queue1.display();

scn.close();
}
}
