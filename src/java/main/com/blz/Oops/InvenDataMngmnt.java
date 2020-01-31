package com.blz.Oops;

import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;

import com.blz.oops.utils.Inventory;
import com.blz.oops.utils.OopsUtility;
import com.blz.utils.InputUtility;

public class InvenDataMngmnt extends Inventory {

	public static void main(String[] args) throws IOException, ParseException {
		String fileName = "/home/user/Desktop/inventary.json";
		JSONArray readData = OopsUtility.readFromJsonFile(fileName);
		 System.out.println("Enter your choice:::: Press\n 0.Rice\n 1.Wheat\n 2.Pulse");
		 int choice = InputUtility.intVal();
		 
		 String item = null;
		 double amount = 0.0;
		 
			switch (choice) {
			case 0:
				item = "Rice";
				break;
			case 1:
				item = "Wheat";
				break;
			case 2:
				item = "Pulse";
				break;
			}
			System.out.println("Enter quantity in kg's:");
			double quantity = InputUtility.doubleVal();
		System.out.println(OopsUtility.findPrice( readData, item,choice, quantity));
			
					}
			
	}
	

