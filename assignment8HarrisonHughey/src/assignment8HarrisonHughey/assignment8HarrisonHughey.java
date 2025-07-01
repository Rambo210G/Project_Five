package assignment8HarrisonHughey;

import java.util.Scanner;

public class assignment8HarrisonHughey {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double wagePerDay;
	        int daysWorked;

	        // Prompt the user to enter the wage per day
	        System.out.println("Please enter your wage per day");
	        wagePerDay = scanner.nextDouble();

	        // Prompt the user to enter the number of days worked
	        System.out.println("Please enter the number of days you has worked");
	        daysWorked = scanner.nextInt();

	        // Print the header
	        System.out.println("Days\t\tSalary");
	        System.out.println("----------------------------------------------");

	        // Calculate and display the salary for each day
	        for (int day = 1; day <= daysWorked; day++) {
	            double salary = wagePerDay * day;
	            System.out.printf("%d\t\t$%.2f%n", day, salary);
	        }

	        scanner.close();
	    }
	}

