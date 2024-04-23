package ui;

import java.util.Scanner;

public class StudentRegistrationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Student Registration Form");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first name: ");
		String firstname = sc.next();
		System.out.print("Enter last name: ");
		String lastname = sc.next();
		System.out.print("Enter year of birth: ");
		String yearOfBirth = sc.next();
		System.out.println();
		System.out.println("Welcome " + firstname + " " + lastname);
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is: " + firstname + "*" + yearOfBirth);

	}

}
