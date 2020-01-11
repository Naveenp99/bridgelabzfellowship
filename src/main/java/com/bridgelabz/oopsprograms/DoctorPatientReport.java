package com.bridgelabz.oopsprograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.bridgelabz.utility.LinkedList.Node;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DoctorPatientReport {

	private Node head;

	// implementing the Search method using LinkedList.
	public boolean search(Object data) {
		Node n = head;
		while (n != null) {
			if (n.getData().equals(data))
				return true;
			n = n.getNext();
		}
		return false;
	}

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in); // creating the Scanner Object to read the Input.
		// Reads text from a character-input stream, buffering characters so as to
		// provide for the efficient reading of characters, arrays, and lines.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		File docfile = new File("/home/user/Desktop/doctor.json"); // linking the Jackson file location Path.
		File patfile = new File("/home/user/Desktop/patient.json"); // linking the Jackson file location Path.
		// mapping the Jackson file and class.
		// creating class array to store the file Data to the readData array.
		ObjectMapper mapper = new ObjectMapper();
		Doctor[] readDoctor = mapper.readValue(docfile, Doctor[].class);
		Patient[] readPatient = mapper.readValue(patfile, Patient[].class);

		int doctors = 1; // initializing doctors variables as 1.
		int patients = 1; // initializing patients variables as 1.
		while (patients <= 5) { // according to the given situation.
			System.out.println(
					"\nEnter the number:  1.Searching the Doctor Details.\n" + " 2.Searching the Patients Details.\n");
			int pick = scn.nextInt();
			switch (pick) {
// if press 1 then case 1 will run, and give the Doctors information.
			case 1:

				System.out.println("\nEnter the number:  1.Searching the Name.\n 2.Searching the Id.\n"
						+ " 3.Searching the Specialization.\n 4.Searching the Availability.\n");
				int choose = scn.nextInt();

				switch (choose) {
				case 1:
					System.out.println("Enter the name of Doctor to Search: ");
					String docname = br.readLine();
					for (int i = 0; i < readDoctor.length; i++) {
						if (readDoctor[i].getName().equals(docname)) {
							System.out.println("Name is Found.");
							doctors++;
							break;
						}
						System.out.println("Not Found in index " + i);
					}
					break;
				case 2:
					System.out.println("Enter the Id of Doctor to Search: ");
					long id = scn.nextLong();
					for (int i = 0; i < readDoctor.length; i++) {
						if (readDoctor[i].getId() == (id)) {
							System.out.println("Id is Found.");
							doctors++;
							break;
						}
						System.out.println("Not Found  in index " + i);
					}
					// System.out.println("Not Found.");

					break;
				case 3:
					System.out.println("Enter the Specialization of Doctor to Search: ");
					String spec = br.readLine();
					for (int i = 0; i < readDoctor.length; i++) {
						if (readDoctor[i].getSpecialization().equals(spec)) {
							System.out.println("Specialization is Found.");
							doctors++;
							break;
						}
						System.out.println("Not Found in index " + i);
					}
					// System.out.println("Not Found.");

					break;
				case 4:
					System.out.println("Enter the Availability of Doctor to Search: ");
					double avai = scn.nextDouble();
					for (int i = 0; i < readDoctor.length; i++) {
						if (readDoctor[i].getAvailability() == (avai)) {
							System.out.println("Availability is Found.");
							doctors++;
							break;
						}
						System.out.println("Not Found  in index " + i);
					}
					// System.out.println("Not Found.");
					break;
				}
				break;
//if press 2 then case 2 will run, and give the patientss information.
			case 2:

				System.out.println("\nEnter the number:  1.Searching the Name.\n 2.Searching the Id.\n"
						+ " 3.Searching the MobileNumber.\n");
				int select = scn.nextInt();

				switch (select) {
				case 1:
					System.out.println("Enter the name of Patient to Search: ");
					String patname = br.readLine();
					for (int i = 0; i < readPatient.length; i++) {
						if (readPatient[i].getName().equals(patname)) {
							System.out.println("Name is Found.");
							patients++;
							break;
						}
						System.out.println("Not Found  in index " + i);
					}
					// System.out.println("Not Found.");
					break;
				case 2:
					System.out.println("Enter the Id of Patient to Search: ");
					long id = scn.nextLong();
					for (int i = 0; i < readPatient.length; i++) {
						if (readPatient[i].getId() == (id)) {
							System.out.println("Id is Found.");
							patients++;
							break;
						}
						System.out.println("Not Found  in index " + i);
					}
					// System.out.println("Not Found.");
					break;
				case 3:
					System.out.println("Enter the MobileNumber of Patient to Search: ");
					long mn = scn.nextLong();
					for (int i = 0; i < readPatient.length; i++) {
						if (readPatient[i].getMobilenumber() == (mn)) {
							System.out.println("MobileNumber is Found.");
							patients++;
							break;
						}
						System.out.println("Not Found  in index " + i);
					}
					// System.out.println("Not Found.");
					break;

				}
				break;
			}
			// According to the situation given.
			if (pick == 1)
				doctors++;
			else if (pick == 2)
				patients++;
		}
		// Count the Total List of Doctors.
		System.out.println("List of the DOCTORS are: " + doctors);
		// Count the Total List of Patientss.
		System.out.println("List of the PATIENTS are: " + patients);
	}
}
