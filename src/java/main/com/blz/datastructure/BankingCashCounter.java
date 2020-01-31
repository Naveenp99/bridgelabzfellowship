package com.blz.datastructure;

import com.blz.datastructure.utils.DatastructureUtility;
import com.blz.utils.InputUtility;

public class BankingCashCounter {

	public static void main(String[] args) {
		DatastructureUtility<Integer> list = new DatastructureUtility<Integer>();
		   System.out.println("Enter the Total Amount: ");
		  int Amount=InputUtility.intVal();
		  int Persncount = 1;
		   while(Amount >= 0) {  
	    		System.out.println("Enter the number 1 to Deposit the Money"
	    				+ " and Enter the number 2 to Withdraw the Money"
	    				+ " and Enter the number 3 to Check the CurrentMoney");
	    		  System.out.println("Enter the Number: ");
	    		   int choose=InputUtility.intVal();	 
if(choose == 1) {
	 System.out.println("Enter the Deposit Amount: ");
	   int Deposit=InputUtility.intVal();
	  System.out.println( DatastructureUtility.deposit(Deposit,Amount));
	   list.push(Persncount++);
	   list.display();
}		  
else if(choose == 2) {
	 System.out.println("Enter the Withdrawal Amount: ");
	   int WithDraw=InputUtility.intVal();
	   System.out.println(DatastructureUtility.withdraw(WithDraw,Amount));
	   list.push(Persncount++);
	   list.display();
}  
else if(choose == 3) 
	System.out.println("The Amount is: "+Amount);
else
	System.out.println("Choose the Correct Number");
		   }
	}
}
