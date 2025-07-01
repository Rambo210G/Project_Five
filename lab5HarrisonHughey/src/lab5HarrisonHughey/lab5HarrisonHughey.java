package lab5HarrisonHughey;

import java.util.Scanner;

public class lab5HarrisonHughey
{
	public static void main(String[] args) 
	{
	Scanner scanner = new Scanner(System.in);
	// Step 2: Prompt the user for input 
	
	System.out.println("Please enter a positive nonzero integer.");
	int userInput = scanner.nextInt(); 
	// Ensure the input is positive and nonzero 
	while (userInput <= 0) { 
	System.out.println("That's not a positive nonzero integer. Please enter again.");
	
	userInput = scanner.nextInt(); }
	// Step 3: Calculate the sum of integers from 1 up to the number entered 
	int sum = 0; for (int i = 1; i <= userInput; i++) { sum += i; } 
	
	// Step 4: Display the sum
	System.out.println("The sum of all the integers between 1 and " + userInput + " is " + sum + "."); 
	
	scanner.close();
	} 
	}
	