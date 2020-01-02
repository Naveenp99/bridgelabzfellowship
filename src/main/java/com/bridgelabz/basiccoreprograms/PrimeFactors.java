package com.bridgelabz.basiccoreprograms;
import java.util.*;
public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=scn.nextInt();
		//Calling Static Parameterized Method in main Method.
		primeFactors(number); 
		scn.close();
	}
	public static void primeFactors(int number) {
		for(int i=2;i<number;i++) {  //Prime Numbers always Starts by 2.
			while(number%i==0) {     //Dividing the given Number by i.
				System.out.println(i);  //Displaying the prime Factor.
				number/=i;           // Taking the number Quotient for Further process.
			}
		}
		if(number>2)
			System.out.println(number);  //if Number is Greater than Two Then directly Display here.
	}
}
