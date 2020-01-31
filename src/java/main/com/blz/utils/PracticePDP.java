package com.blz.utils;

import java.util.ArrayList;
import java.util.List;

public class PracticePDP {
public static void main(String[] args) throws CloneNotSupportedException  {
	Employee emp = new Employee();
	emp.loadData();
	
	Employee edup1 = (Employee) emp.clone();
	Employee edup2 = (Employee) emp.clone();
	
	List<String> list1 = edup1.getelist();
	List<String> list2 = edup2.getelist();
	list1.add("Naveen");
	list1.add("Rama");
	list2.remove("Sachin");
	list2.remove("Karnataka");
	System.out.println(emp.getelist());
	System.out.println(list1);
	System.out.println(list2);
	
}

}

   class Employee  {
	   
	   List<String> elist;
	   
	   public Employee() {
			elist = new ArrayList<String>();
		}
	   
	   public Employee(List<String> list) {
			this.elist = list;
		}
	   
	   public void loadData() {
		   elist.add("Sachin");
		   elist.add("Tendulkar");
		   elist.add("India");
		   elist.add("Karnataka");
		   elist.add("Reigns");
	   }
	   
	   public List<String> getelist() {
		   return elist;
	   }
	
	public Object clone() throws CloneNotSupportedException{
		List<String> temp = new ArrayList<String>();
		for(String string : this.getelist())
		temp.add(string);
		
		return new Employee(temp) ;	
	}
	
   }
