package ui;

import java.util.Scanner;

public class TravelTimeCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Travel Time Calculator");
		Scanner sc = new Scanner(System.in);
		String con = "y";
		
		while(con.equalsIgnoreCase("y")) {
			System.out.println();
			System.out.print("Enter miles: \t\t");
			double miles = Double.parseDouble(sc.next());
			
			System.out.print("Enter miles per hour: \t");
			double mph = Double.parseDouble(sc.next());
			
			System.out.println();
			System.out.println("Estimated travel time");
			System.out.println("---------------------");
			System.out.println("Hours: \t" + (int)Math.floor(miles/mph));
			System.out.println("Minutes: " + (int)(miles % mph));
			System.out.println();
			
			System.out.print("Continue? (y/n): ");
			con = sc.next();
		}
		
		System.out.println("Good-bye!");
	}

}
