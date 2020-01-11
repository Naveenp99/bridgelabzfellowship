package com.bridgelabz.oopsprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AddressBook {
	private Node head;
	private Node prev;
	private int size;

	public class Node {
		private Node next;
		private Object data;

		public Node(Object data) {
			this.data = data;
		}

		/**
		 * @return the next
		 */
		public Node getNext() {
			return next;
		}

		/**
		 * @param next the next to set
		 */
		public void setNext(Node next) {
			this.next = next;
		}

		/**
		 * @return the data
		 */
		public Object getData() {
			return data;
		}

		/**
		 * @param data the data to set
		 */
		public void setData(Object data) {
			this.data = data;
		}
	}

	public void add(Object data) {
		Node node = new Node(data);
		if (head == null)
			head = node;
		else {
			Node temp = head;
			while (temp != null) {
				if (temp.next == null) {
					temp.next = node;
					break;
				}
				temp = temp.next;
			}
		}
	}

	// Implementing the Delete Method.
	public boolean delete(Object data) {
		Node temp = head;
		if (temp != null && temp.data.equals(data)) {
			head = temp.getNext();
			temp.next = null;
			size--;
			return true;
		}
		while (temp != null && !(temp.data.equals(data))) {
			prev = temp;
			temp = temp.getNext();
		}
		if (temp == null)
			return false;
		prev.setNext(temp.getNext());
		size--;
		return true;
	}

	// Implementing the Sort by Name Method to Sort.
	public static void sortByName(String[] names) {
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].compareTo(names[j]) > 0) {
					String temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
	}

	// Implementing the Display Method to Display.
	public void display() {

		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		while (head != null) {
			System.out.print(head.getData() + "  ");
			head = head.getNext();
		}
	} // Implementing the Sort by Zip Code Method to Sort.

	public static void sortByZip(int[] zip) {

		for (int i = 0; i < zip.length; i++) {
			for (int j = i + 1; j < zip.length; j++) {
				if (zip[i] > (zip[j])) {
					int temp = zip[i];
					zip[i] = zip[j];
					zip[j] = temp;
				}
			}
		}

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Creating the AddressBook Objects.
		AddressBook ab1 = new AddressBook();
		AddressBook ab2 = new AddressBook();
		Scanner scn = new Scanner(System.in);
		// Reads text from a character-input stream, buffering characters so as to
		// provide for the efficient reading of characters, arrays, and lines.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(
				"Enter the Number\n 1.for ADD.\n 2.for DELETE\n " + "3.for SORT BY NAME\n 4.for SORT BY ZIP CODES\n");

		int choose = scn.nextInt();
		switch (choose) {
		case 1:
			System.out.println("Enter the Number of NAMES: ");
			int n = Integer.parseInt(br.readLine());
			System.out.println("\nEnter the Number ZIP CODES: ");
			int N = scn.nextInt();

			String[] name = new String[n];
			System.out.println("Enter the NAMES: ");
			for (int i = 0; i < n; i++) {
				name[i] = br.readLine();
			}

			for (Object obj1 : name)
				ab1.add(obj1);
			System.out.println("Enter the NAME you want to Add: ");
			String addName = br.readLine();
			ab1.add(addName);

			int[] zipcodes = new int[N];
			System.out.println("Enter the ZIP CODES: ");
			for (int j = 0; j < N; j++) {
				zipcodes[j] = scn.nextInt();
			}

			for (Object obj2 : zipcodes)
				ab2.add(obj2);
			System.out.println("Enter the ZIP CODE you want to Add: ");
			int addZipCode = scn.nextInt();
			ab2.add(addZipCode);
			ab1.display();
			System.out.println();
			ab2.display();
			break;

		case 2:
			System.out.println("Enter the Number of NAMES: ");
			int n1 = Integer.parseInt(br.readLine());
			System.out.println("\nEnter the Number ZIP CODES: ");
			int N1 = scn.nextInt();

			String[] name1 = new String[n1];
			System.out.println("Enter the NAMES: ");
			for (int i = 0; i < n1; i++) {
				name1[i] = br.readLine();
			}

			for (Object obj1 : name1)
				ab1.add(obj1);
			System.out.println("Enter the NAME you want to Delete: ");
			String delName1 = br.readLine();
			ab1.delete(delName1);
			// ab1.display();

			int[] zipcodes1 = new int[N1];
			System.out.println("\nEnter the ZIP CODES: ");
			for (int j = 0; j < N1; j++) {
				zipcodes1[j] = scn.nextInt();
			}

			for (Object obj2 : zipcodes1)
				ab2.add(obj2);
			System.out.println("Enter the ZIP CODE you want to Delete: ");
			int delZipCode1 = scn.nextInt();
			ab2.delete(delZipCode1);
			ab1.display();
			System.out.println();
			ab2.display();
			break;

		case 3:

			System.out.println("Enter the Number of NAMES: ");
			int n2 = Integer.parseInt(br.readLine());
			String[] name2 = new String[n2];
			System.out.println("Enter the NAMES: ");
			for (int i = 0; i < n2; i++) {
				name2[i] = br.readLine();
			}
			sortByName(name2);
			for (Object obj1 : name2)
				ab1.add(obj1);
			System.out.println("Sorted by Names is: ");
			ab1.display();
			break;

		case 4:

			System.out.println("\nEnter the Number ZIP CODES: ");
			int N2 = scn.nextInt();
			int[] zipcodes2 = new int[N2];
			System.out.println("\nEnter the ZIP CODES: ");
			for (int j = 0; j < N2; j++) {
				zipcodes2[j] = scn.nextInt();
			}
			sortByZip(zipcodes2);
			for (Object obj2 : zipcodes2)
				ab2.add(obj2);
			System.out.println("Sorted by Zip Codes is: ");
			ab2.display();
			break;
		}
		br.close();
		scn.close();
	}
}