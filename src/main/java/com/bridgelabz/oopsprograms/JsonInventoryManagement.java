package com.bridgelabz.oopsprograms;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonInventoryManagement {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		File file = new File("/home/user/Desktop/indata.json"); // linking the Jackson file location Path.
		ObjectMapper mapper = new ObjectMapper(); // mapping the Jackson file and class.
		// creating class array to store the file Data to the readData array.
		Inventory[] readData = mapper.readValue(file, Inventory[].class);
		Scanner scn = new Scanner(System.in); // to read the input Scanner is necessary.

		for (int i = 0; i < readData.length; i++) {
			System.out.println("Enter the Price and name: ");
			double Price = scn.nextDouble(); // enter the amount of Price.
			String name = scn.nextLine(); // enter the name.
			readData[i].setPrice(Price); // Set method to set the price.
			readData[i].setName(name); // Set method to set the name
		}
		mapper.writeValue(file, readData); // Update the changes in the source file.
		scn.close();
	}

}
