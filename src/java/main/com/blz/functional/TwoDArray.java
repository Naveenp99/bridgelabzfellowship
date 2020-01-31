package com.blz.functional;

import com.blz.functional.utils.FunctionalUtility;
import com.blz.utils.InputUtility;

public class TwoDArray {

	public static void main(String[] args) {
		System.out.println("Enter the number of Rows: ");
		int row=InputUtility.intVal();
		System.out.println("Enter the number of Columns: ");
		int coloumn=InputUtility.intVal();
		int[][] array=new int[row][coloumn];
		System.out.println("Number of rows and coloumns are: "+row+" x "+coloumn);
		array = FunctionalUtility.getTwoDArray(array,row,coloumn);
		FunctionalUtility.displayTwoDArray(array,row,coloumn);
	}
	
}
