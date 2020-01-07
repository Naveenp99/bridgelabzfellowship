package com.bridgelabz.datastructure.base;
import java.util.Scanner;
import  com.bridgelabz.utility.*;
public class Calendar<T> {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number of month: ");
		int month=scn.nextInt();
		System.out.println("Enter the number of year: ");
		int year=scn.nextInt();
		scn.close();
   
        // months[i] = name of month i
        String[] months = {
            "",                 // leave empty so that months[1] = "January"
            "January", "February", "March",
            "April", "May", "June",
            "July", "August", "September",
            "October", "November", "December" };

        // days[i] = number of days in month i
        int[] days = {
            0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // check for leap year
        if (month == 2 && LeapYear.isLeapYear(year)) days[month] = 29;


        // print calendar header
        System.out.println("   " + months[month] + " " + year);
        System.out.println(" S  M Tu  W Th  F  S");

        // starting day
        int d = DayOfWeek.dayOfWeek(month,1, year);
        int[][] arr=new int[month+1][d+1];                    // Creating Array Object.
        
        // print the calendar
        for (int i = 0; i < d; i++)
            System.out.print("   ");
        for (int i = 1; i <= days[month]; i++) {
        	arr[month][d]=i;               // Storing i Value in Array.
        	 System.out.printf("%2d ", arr[month][d]);
            if (((arr[month][d]+ d) % 7 == 0) || (arr[month][d] == days[month]))  System.out.println();
        }

    }
}
	
