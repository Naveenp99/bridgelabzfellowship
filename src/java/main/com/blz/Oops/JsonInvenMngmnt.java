package com.blz.Oops;

import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import com.blz.oops.utils.Inventory;
import com.blz.oops.utils.OopsUtility;
import com.blz.utils.InputUtility;

public class JsonInvenMngmnt extends Inventory{

	public static void main(String[] args) throws IOException, ParseException {
		
		String fileName = "/home/user/Desktop/indata.json";
		JSONArray readData = OopsUtility.readFromJsonFile( fileName);
		System.out.println("Enter your choice:::: Press\n 0.Rice\n 1.Wheat\n 2.Pulse\n 3.Terminate.");
		 int choice = InputUtility.intVal();
		 
		 String item = null;
		 boolean status = true;
		 while(status) {
			switch (choice) {
			case 0:
				item = "Rice";
			   OopsUtility.addAndWrite( readData,  item, choice, fileName);
				return;
			
			case 1:
				item = "Wheat";
				OopsUtility.addAndWrite( readData, item, choice, fileName);
				return;
				
			case 2:
				item = "Pulse";
				OopsUtility.addAndWrite( readData,item, choice, fileName);
				return;
				
			case 3:
				System.out.println("Data Successfully Saved.");
				status = false;
				break;
			}
		
		 }
	}
	
}
