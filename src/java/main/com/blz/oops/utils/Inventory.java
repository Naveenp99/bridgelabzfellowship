package com.blz.oops.utils;

import java.io.IOException;

import com.blz.utils.InputUtility;

public class Inventory {

	private String name;
	private double price;
	
	public void Inventory() throws IOException {
		System.out.println("Enter the Name: ");
		String name = InputUtility.stringVal();
		this.name = name;
		System.out.println("Enter the Price: ");
		double price = InputUtility.doubleVal();
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
