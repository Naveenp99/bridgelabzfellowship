package com.blz.oops.utils;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.UnaryOperator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.blz.utils.InputUtility;

public class OopsUtility  {
	
	public static JSONArray readFromJsonFile(String fileName) throws IOException, ParseException {
		
		JSONArray jsonarray = new JSONArray();
		File file = new File(fileName);
		if(file.length() != 0)
			jsonarray = (JSONArray) new JSONParser().parse(new FileReader(fileName));
		
		return jsonarray;
	}
	
public static String findPrice(JSONArray readData, String item, int choice, double quantity) {
	JSONObject object=(JSONObject) readData.get(choice);
	double res=quantity*(double) object.get("price");
	return "Amount for " + quantity + " kg of " + item + " is " + res;
}

public static double findPriceOfManag(JSONArray readData, double price, String item, int choice, double quantity) {
	double res=quantity*price;
	return res;
}

@SuppressWarnings("unchecked")
public static void addNewToJSON(String fileName, Object object) {
        	 
        	 try {
        		 JSONArray array = new JSONArray();
        		 JSONObject jobj = new JSONObject();
        		 File file = new File(fileName);
        		 if(file.length() != 0) {
        			 try {
        				 array = (JSONArray) new JSONParser().parse(new FileReader(fileName));
        			 }
        			 catch (Exception e) {
						System.out.println(e);
					}
        		 }
        		 jobj.put("FirstName", ((AdresBook) object).getFirstName());
        		 jobj.put("LaststName", ((AdresBook) object).getLaststName());
        		 jobj.put("Address", ((AdresBook) object).getAddress());
        		 jobj.put("City", ((AdresBook) object).getCity());
        		 jobj.put("State", ((AdresBook) object).getState());
        		 jobj.put("ZipCode", ((AdresBook) object).getZipCode());
        		 jobj.put("PhoneNumber", ((AdresBook) object).getPhoneNumber());
        		 array=readFromJsonFile(fileName);
        		 
        		 FileWriter fw = new FileWriter(fileName);
        		 PrintWriter pw = new PrintWriter(fw);
        		 array.add(jobj);
        		 pw.println(array.toString());
        		 fw.close();
        		 pw.close();
        	 }
        	 catch (Exception e) {
				System.out.println(e);
			}
         }

@SuppressWarnings("unchecked")
public static void addAndWrite(JSONArray readData,String item, int choice, String fileName) throws IOException, ParseException {
	JSONArray array = new JSONArray();
System.out.println("Enter quantity in kg's:");
double quantity = InputUtility.doubleVal();
System.out.println("Enter price:");
double price = InputUtility.doubleVal();
double total = OopsUtility.findPriceOfManag( readData,price ,item,choice, quantity);
JSONObject jobj = new JSONObject();
jobj.put("name", item);
jobj.put("price", price);
jobj.put("Output", total);

array=readFromJsonFile(fileName);

FileWriter fw = new FileWriter(fileName);
PrintWriter pw = new PrintWriter(fw);
array.add(jobj);
pw.println(array.toString());
fw.close();
pw.close();

}
       
public static void removeFromJsonFile( String fileName) throws IOException {
	
	System.out.println("Enter the FirstName to Remove: ");
	String FirstName = InputUtility.stringVal();
	
	System.out.println("Enter the LastName to Remove: ");
	 String LastName = InputUtility.stringVal();
	 
	System.out.println("Enter ZipCode to Remove: ");
	long ZipCode = InputUtility.longVal();
	
	JSONArray array = new JSONArray();

	try {
		array = readFromJsonFile(fileName);
	}
	catch (Exception e) {
		System.out.println(e);
	}
	
	for (int i = 0; i < array.size(); i++) {
		JSONObject jobj = (JSONObject) array.get(i);
	 if(jobj.get("FirstName").equals(FirstName)  && 
		jobj.get("LaststName").equals(LastName)    && 
		jobj.get("ZipCode").equals(ZipCode) )
		    
			array.remove(jobj);
	}
	FileWriter fw = new FileWriter(fileName);
	PrintWriter pw = new PrintWriter(fw);
	pw.println(array.toString());
	fw.close();
	pw.close();
}

@SuppressWarnings({ "unchecked" })
public static JSONArray editAndUpdate(String fileName) throws IOException {
	
	JSONArray array = new JSONArray();
	try {
		array = readFromJsonFile(fileName);
	}
	catch (Exception e) {
		System.out.println(e);
	}
	
	System.out.println("Enter the Name: ");
	String name = InputUtility.stringVal();
	
	System.out.println("Enter the Edited Address: ");
	String editedAddress = InputUtility.stringVal();
	
	System.out.println("Enter the Edited City: ");
	String editedCity = InputUtility.stringVal();
	
	System.out.println("Enter the Edited State: ");
	String editedState = InputUtility.stringVal();
	
	System.out.println("Enter Edited ZipCode: ");
	long editedZipCode = InputUtility.longVal();
	
	System.out.println("Enter Edited PhoneNumber: ");
	long editedPhoneNumber = InputUtility.longVal();
	
	JSONObject jobj = null;
	for (int i = 0; i < array.size(); i++) {
		jobj = (JSONObject) array.get(i);
		String Name = (String) jobj.get("FirstName");
		if(Name.equalsIgnoreCase(name)) {
			jobj.replace("Address", editedAddress);
			jobj.replace("City", editedCity);
			jobj.replace("State", editedState);
			jobj.replace("ZipCode", editedZipCode);
			jobj.replace("PhoneNumber", editedPhoneNumber);
		}
		if(!(Name.equalsIgnoreCase(name))) {
			
		}
	}
	array.add(jobj);
            return array;			
}
  
@SuppressWarnings({ "unchecked", "rawtypes" })
public static void sortByFirstName( String fileName) throws IOException {
	
	JSONArray array = new JSONArray();
	try {
		array = readFromJsonFile(fileName);
	}
	catch (Exception e) {
		System.out.println(e);
	}
	
    JSONArray sortedJsonArray = new JSONArray();
    List list = new ArrayList();
    for(int i = 0; i < array.size(); i++) {
       list.add(array.get(i));
    }
    System.out.println("Before Sorted JSONArray: " + array);
    Collections.sort(list, new Comparator() {
       private static final String NAME = "FirstName";
       
	@SuppressWarnings("unused")
	public int compare(JSONObject a, JSONObject b) {
          String str1 = new String();
          String str2 = new String();
          try {
             str1 = (String)a.get(NAME);
             str2 = (String)b.get(NAME);
          } catch(Exception e) {
             e.printStackTrace();
          }
          return str1.compareTo(str2);
       }
    
       public int compareTo(Object arg0) {
    	
    		return 0;
    	}

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
    });
       
    for(int i = 0; i < array.size(); i++) {
        (sortedJsonArray).add(list.get(i));
    }
    System.out.println("Sorted JSON Array with Name: " + sortedJsonArray);
    
    FileWriter fw = new FileWriter(fileName);
	PrintWriter pw = new PrintWriter(fw);
	pw.println(sortedJsonArray.toString());
	fw.close();
	pw.close();
}

@SuppressWarnings("unchecked")
public static void sortByLastName( String fileName) throws IOException {

	JSONArray array = new JSONArray();
	try {
		array = readFromJsonFile(fileName);
	}
	catch (Exception e) {
		System.out.println(e);
	}
	
    JSONArray sortedJsonArray = new JSONArray();
    List list = new ArrayList();
    for(int i = 0; i < array.size(); i++) {
       list.add(array.get(i));
    }
    System.out.println("Before Sorted JSONArray: " + array);
    Collections.sort(list, new Comparator() {
       private static final String NAME = "LastName";
       
      
	public int compare(JSONObject a, JSONObject b) {
          String str1 = new String();
          String str2 = new String();
          try {
             str1 = (String)a.get(NAME);
             str2 = (String)b.get(NAME);
          } catch(Exception e) {
             e.printStackTrace();
          }
          return str1.compareTo(str2);
       }
	@Override
	public int compare(Object arg0, Object arg1) {			
		return 0;
	}
    });
    for(int i = 0; i < array.size(); i++) {
        sortedJsonArray.add(list.get(i));
    }
    System.out.println("Sorted JSON Array with Name: " + sortedJsonArray);
    
    FileWriter fw = new FileWriter(fileName);
	PrintWriter pw = new PrintWriter(fw);
	pw.println(sortedJsonArray.toString());
	fw.close();
	pw.close();
}





}






	

