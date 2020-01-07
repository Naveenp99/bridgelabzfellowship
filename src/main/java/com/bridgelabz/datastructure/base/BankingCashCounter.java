package com.bridgelabz.datastructure.base;
import com.bridgelabz.utility.*;
import java.util.Scanner;

public class BankingCashCounter<T> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// Create a Scanner to read the Input.	
		Scanner scn=new Scanner(System.in);
		   System.out.println("Enter the Total Amount: ");
		   int Amount=scn.nextInt();
		   cashCount(Amount);  // call the Static method.
		   scn.close();
	}
public static void cashCount(int Amount) { 
	Queue<Integer> queue1=new Queue<Integer>(); //Create the Queue Object of Integer DataType.
	
	Scanner scn=new Scanner(System.in);
	int Persncount=0;   //Initialized Count to Count the number of Persons.

	while(Amount>0) {  //Entered Amount should be greater than ZERO.
		System.out.println("Enter the number 1 to Deposit the Money"
				+ " and Enter the number 2 to Withdraw the Money"
				+ " and Enter the number 3 to Check the CurrentMoney");
		
		   System.out.println("Enter the Number: ");
		   int choose=scn.nextInt();	
		   if(choose==1) {  //if you enter 1 it will work.
			   System.out.println("Enter the Deposit Amount: ");
			   int Deposit=scn.nextInt();
			   Amount+=Deposit;   //find the total amount after Deposit.
			   System.out.println("Remaining Total Amount is: "+Amount); 
			   queue1.enqueue(Persncount++);  //enqueue the number of persons.
			  
		   }
		   else if(choose==2) {   //if you enter 2 it will work.
			   System.out.println("Enter the Withdrawal Amount: ");
			   int WithDraw=scn.nextInt();
			   Amount-=WithDraw;   //find the total amount after WithDrawal.
			   System.out.println("Remaining Total Amount is: "+Amount);  
			   queue1.enqueue(Persncount++);      //enqueue the number of persons.
			   
		   }
		   else if(choose==3) {   //if you enter 3 it will work.
			   System.out.println("The Current Amount is: "+Amount);
		   }
		   else {    //if you enter others key.
			   System.out.println("Choose Currect Key");
		   }
		   
	}
	System.out.println("Amount is InSufficient ");
	System.out.println("\nNumber of Persons who Deposited and WithDrawn: ");
	 queue1.dequeue();   //dequeue the number of persons.
	queue1.display();

scn.close();
}
}
