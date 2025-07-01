package assignment9HarrisonHughey;

import java.util.Scanner;

public class assignment9HarrisonHughey {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double dailyRate;
	        int daysStayed;

	        // Prompt the user to enter the hotel daily rate
	        System.out.println("Please enter the hotel daily rate");
	        dailyRate = scanner.nextDouble();

	        // Prompt the user to enter the number of days stayed
	        System.out.println("Please enter the number of days you stay");
	        daysStayed = scanner.nextInt();

	        // Print the header
	        System.out.println("Days\t\tHotel Fee");
	        System.out.println("----------------------------------------------");

	        // Calculate and display the hotel fee for each day
	        for (int day = 1; day <= daysStayed; day++) {
	            double hotelFee = dailyRate * day;
	            System.out.printf("%d\t\t$%.2f%n", day, hotelFee);
	        }

	        scanner.close();
	    }
	}



