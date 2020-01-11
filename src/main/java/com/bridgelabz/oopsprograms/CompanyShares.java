package com.bridgelabz.oopsprograms;

import com.bridgelabz.oopsprograms.LinkedList;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CompanyShares {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in); // creating the Scanner Object to read the Input.
		// Reads text from a character-input stream, buffering characters so as to
		// provide for the efficient reading of characters, arrays, and lines.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		File file = new File("/home/user/Desktop/CompanyShare.json"); // linking the Jackson file location Path.
		ObjectMapper mapper = new ObjectMapper(); // mapping the Jackson file and class.
		// creating class array to store the file Data to the readData array.
		CompanyShare[] readData = mapper.readValue(file, CompanyShare[].class);

		LinkedList list = new LinkedList(); // creating LinkedList Object to store.

		// Push all the json file Data to the LinkedList Object.
		for (int i = 0; i < readData.length; i++) {
			list.pushObject(readData[i].getName());
			list.pushObject(readData[i].getShare());
			list.pushObject(readData[i].getPrice());

		}

		System.out.println("\nEnter the Number\n 1.ADD.\n 2.REMOVE.\n 3.DISPLAY.");
		int choose = scn.nextInt();
		// depend on the Choose switch cases will work.
		switch (choose) {

		case 1:

			System.out.print("\nEnter the data to ADD: \n");

			System.out.println("ADD the Name ");
			String compName = br.readLine();
			// calling push method to add data to the list.
			list.pushObject(compName);
			// readData[i].setName(compName);

			System.out.println("ADD the Share ");
			double compShare = scn.nextDouble();
			list.pushObject(compShare);
			// readData[i].setShare(compShare);

			System.out.println("ADD the Price ");
			double compPrice = scn.nextDouble();
			list.pushObject(compPrice);
			// readData[i].setPrice(compPrice);

			list.displayObject();

			mapper.writeValue(file, readData);
			break;

		case 2:
			System.out.println("\nEnter the data to REMOVE: \n");

			System.out.println("Enter the name: ");
			String compname = br.readLine();

			System.out.println("Enter the Share: ");
			double compshare = scn.nextDouble();

			System.out.println("Enter the Price: ");
			double compprice = scn.nextDouble();
			// put the Condition According to the Situation.
			for (int j = 0; j < readData.length; j++) {
				if (readData[j].getName().contentEquals(compname) || readData[j].getShare() == (compshare)
						|| readData[j].getPrice() == (compprice)) {
					// Calling remove Method to remove the object.
					list.removeObject(readData[j].getName());
					list.removeObject(readData[j].getShare());
					list.removeObject(readData[j].getPrice());
				} else
					System.out.println(
							readData[j].getName() + " " + readData[j].getShare() + " " + readData[j].getPrice());

			}
			break;

		case 3:
			// calling display method to show data.
			list.displayObject();
			break;

		default:
			break;
		}
		scn.close();
		br.close();
	}

}
