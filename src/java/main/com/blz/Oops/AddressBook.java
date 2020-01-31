package com.blz.Oops;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import com.blz.oops.utils.AdresBook;
import com.blz.oops.utils.OopsUtility;
import com.blz.utils.InputUtility;

public class AddressBook {

	public static void main(String[] args) throws IOException, ParseException {
	    
		AdresBook ab = new AdresBook();
		String fileName = "/home/user/Desktop/Abook.json";
		
		boolean status = true;
		while(status) {
		System.out.println(
				"Enter the Number\n 1.for ADD Person.\n 2.for DELETE Person\n " + 
		        " 3.for SORT BY Person FirstNAME\n 4.for SORT BY Person LastNAME\n 5.for SORT BY Person ZIP CODES\n" + 
			    " 6.for EDIT Person Data\n 7.for TERMINATE" );
		
		System.out.println("Enter the number to Choose: ");
		int choose = InputUtility.intVal();
		
		switch (choose) {
case 1:
	// String fileName = "/home/user/Desktop/Abook.json";
	ab.AdresBook();
	       OopsUtility.addNewToJSON(fileName,  ab);
			break;
case 2:
		OopsUtility.removeFromJsonFile(fileName);
			break;
case 3:
	OopsUtility.sortByFirstName(fileName);
	break;
case 4:
	OopsUtility.sortByLastName(fileName);
	break;
case 5:
	
	break;
case 6:
	JSONArray array = new JSONArray();
	array = OopsUtility.editAndUpdate(fileName);
	FileWriter fw = new FileWriter(fileName);
	PrintWriter pw = new PrintWriter(fw);
	pw.println(array.toString());
	fw.close();
	pw.close();
	break;
case 7:
	System.out.println(".///////////DATA is Successfully Saved/////////.");
	status = false;
	break;

		default:
			break;
		}
		
	}
	}
}
