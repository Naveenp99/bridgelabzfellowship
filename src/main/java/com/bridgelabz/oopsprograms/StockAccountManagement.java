package com.bridgelabz.oopsprograms;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonParseException;
// import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StockAccountManagement {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		// mapper.writeValue(file, readData);

		Scanner scn = new Scanner(System.in);
		File file = new File("/home/user/Desktop/stocks.json"); // linking the Jackson file location Path.
		// mapping the Jackson file and class.
		// creating class array to store the file Data to the readData array.
		ObjectMapper mapper = new ObjectMapper();
		// mapper.configure(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES, false);
		Stock[] stockData = mapper.readValue(file, Stock[].class); // class value type.

		int N = stockData.length;
		System.out.println("the number of Stocks is: " + N);
		double Total = 0.0; // initializing total as 0.0
		for (int i = 0; i < N; i++) {
			// shareamount is multiple of share and price.
			double SharedAmount = stockData[i].getAddedshares() * stockData[i].getShareprice();
			// print the final result each shares of companies.
			System.out.println(stockData[i].getSharename() + " the SharedAmount is: " + SharedAmount);
			Total += SharedAmount; // finding the total shareamount.
		}
		// display the total shared amount.
		System.out.print("Total Shares is: " + Total);
		scn.close();
	}
}
