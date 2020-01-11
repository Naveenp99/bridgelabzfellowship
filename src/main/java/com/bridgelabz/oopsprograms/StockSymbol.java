package com.bridgelabz.oopsprograms;

import com.bridgelabz.utility.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StockSymbol {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Number of Company Names: ");
		int n = scn.nextInt();
		impln(n); // calling static method.
		scn.close();
	}

	public static void impln(int N) throws IOException {
		Stack stack = new Stack(); // creating Stack object for store the Purchased names.
		Stack stackSold = new Stack(); // creating Stack object for store the Sold names.
		Scanner scn = new Scanner(System.in);
		// Reads text from a character-input stream, buffering characters so as to
		// provide for the efficient reading of characters, arrays, and lines.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (N > 0) {
			System.out.println("\nEnter the number 1. If Purchased or 2. If Sold: ");
			int number = scn.nextInt();
			// depend on the number variable switch case will work.
			switch (number) {
			case 1:
				System.out.println("\nEnter the Name: ");
				String Name = br.readLine(); // read the input from Scanner object.
				stack.push(Name); // Pushing Purchased data into the Stack.
				N--; // after the cases N variable should be Decrement.
				break;

			case 2:
				System.out.println("\nEnter the Name: ");
				String name = br.readLine(); // read the input from Scanner object.
				stackSold.push(name); // Pushing Sold data into the Stack.
				N--; // after the cases N variable should be Decrement.
				break;
			}
		}
		// Display the Final result of Purchased.
		System.out.print("Purchased are: ");
		stack.display();
		System.out.print("\n__________________");
		System.out.print("\n__________________");
		System.out.println();
		// Display the Final result of Solded.
		System.out.print("\nSolds are: ");
		stackSold.display();
		scn.close();

	}

}
