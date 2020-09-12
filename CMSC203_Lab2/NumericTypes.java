package main;

/**
This program demonstrates how numeric types and operators behave in Java
*/
import java.util.Scanner;


public class NumericTypes {
	public static void main (String [] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
		//TASK #2 Create a Scanner object here 
		//identifier declarations
		final int NUMBER = 2; // number of scores
//		int score1 = 100; // first test score
//		int score2 = 95; // second test score
		final int BOILING_IN_F = 212; // boiling temperature
		double fToC; // temperature in Celsius
		double average; // arithmetic average
		String output; // line of output to print out
		//Task #2 declare a variable to hold the user’s temperature
		//Task #2 prompt user to input score1
		//Task #2 read score1 
		//Task #2 prompt user to input score2
		//Task #2 read score2 
		// Find an arithmetic average
		
		System.out.println("Enter first score:");
		int score1 = myScanner.nextInt();
		System.out.println("Enter second score:");
		int score2 = myScanner.nextInt();
		
		average = (score1 + score2) / NUMBER;
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		// Convert Fahrenheit temperatures to Celsius
		fToC = (5d/9d) * (BOILING_IN_F - 32);
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		//Task #2 prompt user to input another temperature
		//Task #2 read the user’s temperature in Fahrenheit
		//Task #2 convert the user’s temperature to Celsius
		//Task #2 print the user’s temperature in Celsius
		System.out.println("Enter a temperature: ");
		int temp = myScanner.nextInt();
		fToC = (5d/9d) * (temp - 32);
		System.out.println(temp + " in Fahrenheit is " + fToC + " in Celsius.");
		
		myScanner.close();
		
		System.out.println("Goodbye"); // to show that the program is ended	
	}
}
