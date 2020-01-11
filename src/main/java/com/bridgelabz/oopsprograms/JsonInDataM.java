package com.bridgelabz.oopsprograms;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonParseException; //download Jackson core of some version.
import com.fasterxml.jackson.databind.JsonMappingException; //download Jackson databind of some version.
import com.fasterxml.jackson.databind.ObjectMapper; //download Jackson annovation of some version.

public class JsonInDataM {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		File file = new File("/home/user/Desktop/inventary.json"); // linking the Jackson file location Path.
		ObjectMapper mapper = new ObjectMapper(); // mapping the Jackson file and class.
		// creating class array to store the file Data to the readData array.
		Inventory[] readData = mapper.readValue(file, Inventory[].class);

		System.out.println("Enter your choice:::: Press\n 1.Rice\n 2.Wheat\n 3.Pulse");
		Scanner scn = new Scanner(System.in);
		int choice = scn.nextInt();

		String item = null;
		// according to choice variable switch will run/decide the cases.
		switch (choice) {
		case 1:
			item = "Rice";

			break;

		case 2:
			item = "Wheat";
			break;
		case 3:
			item = "Pulse";
			break;
		}

		System.out.println("Enter quantity in kg's:");
		double quantity = scn.nextDouble();

		double amount = 0.0; // initializing the amount as 0.

		for (int i = 0; i < readData.length; i++) {
//   put the condition according to the situation given. 
			if (readData[i].getName().equalsIgnoreCase(item))
				amount = quantity * (readData[i].getPrice());

		}

		// To write data to JSON File
		/*
		 * readData[0].setPrice(100); mapper.writeValue(file, readData);
		 */
		// print the Final output.
		System.out.println("Amount for " + quantity + " kg of " + item + " is " + amount);

	}

}
