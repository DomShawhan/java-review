package ui;

import java.util.Scanner;

public class FactorialCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Factorial Calculator");
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		
		String again = "y";
		while(again.equalsIgnoreCase("y")) {
			System.out.print("Enter an integer that's greater than 0 and less than 10: ");
			int input = Integer.parseInt(scanner.next());
			int factorial = 1;
			
			for(int i = 1; i <= input; i++) {
				factorial *= i;
			}
			
			System.out.println("The factorial of " + input + " is " + factorial + ".");
			System.out.println();
			System.out.print("Continue? (y/n): ");
			again = scanner.next();
		}
		
		System.out.println("Good-bye");
	}
}
