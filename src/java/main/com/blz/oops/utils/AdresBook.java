package com.blz.oops.utils;

import java.io.IOException;

import com.blz.utils.InputUtility;

public class AdresBook {

	private String FirstName;
	private String LaststName;
	private String Address;
	private String City;
	private String State;
	private long ZipCode;
	private long PhoneNumber;
	
	public String getFirstName() {
		return FirstName;
	}
	public void AdresBook() throws IOException {
		System.out.println("Enter FirstName: ");
		String FirstName = InputUtility.stringVal();
		this.FirstName = FirstName;
		System.out.println("Enter LastName: ");
		String LastName = InputUtility.stringVal();
		this.LaststName = LastName;
		System.out.println("Enter Address: ");
		String Address = InputUtility.stringVal();
		this.Address = Address;
		System.out.println("Enter City: ");
		String City = InputUtility.stringVal();
		this.City = City;
		System.out.println("Enter State: ");
		String State = InputUtility.stringVal();
		this.State = State;
		System.out.println("Enter ZipCode: ");
		long ZipCode = InputUtility.longVal();
		this.ZipCode = ZipCode;
		System.out.println("Enter PhoneNumber: ");
		long PhoneNumber = InputUtility.longVal();
		this.PhoneNumber = PhoneNumber;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLaststName() {
		return LaststName;
	}
	public void setLaststName(String laststName) {
		LaststName = laststName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public long getZipCode() {
		return ZipCode;
	}
	public void setZipCode(long zipCode) {
		ZipCode = zipCode;
	}
	public long getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		PhoneNumber = phoneNumber;
	}
		
}
