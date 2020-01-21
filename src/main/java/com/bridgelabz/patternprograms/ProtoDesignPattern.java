package com.bridgelabz.patternprograms;

import java.util.ArrayList;
import java.util.List;

public class ProtoDesignPattern {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		Employees emps = new Employees();
		emps.loadData();

		// Use the clone method to get the Employee object
		Employees empsNew = (Employees) emps.clone();
		Employees empsNew1 = (Employees) emps.clone();
		List<String> list = empsNew.getEmpList();
		list.add("John Cena");
		List<String> list1 = empsNew1.getEmpList();
		list1.remove("pavan");

		System.out.println("emps List: " + emps.getEmpList());
		System.out.println("empsNew List: " + list);
		System.out.println("empsNew1 List: " + list1);

	}

}

class Employees  {

	private List<String> empList;

	public Employees() {
		empList = new ArrayList<String>();
	}

	public Employees(List<String> list) {
		this.empList = list;
	}

	public void loadData() {
		// read all employees from database and put into the list
		empList.add("pavan");
		empList.add("ram");
		empList.add("naveen");
		empList.add("rocky");
	}

	public List<String> getEmpList() {
		return empList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<String>();
		for (String s : this.getEmpList()) {
			temp.add(s);
		}
		return new Employees(temp);
	}

}