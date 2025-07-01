package lab9HarrisonHughey;

import java.util.Scanner;

public class lab9HarrisonHughey {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double wagePerHour;
        int hoursWorked;

        // Prompt the user to enter the wage per hour
        System.out.println("Please enter your wage per hour");
        wagePerHour = scanner.nextDouble();

        // Prompt the user to enter the number of hours worked
        System.out.println("Please enter the number of hours you has worked");
        hoursWorked = scanner.nextInt();

        // Print the header
        System.out.println("Hours\t\tLabor fee");
        System.out.println("----------------------------------------------");

        // Calculate and display the labor fee for each hour
        for (int hour = 1; hour <= hoursWorked; hour++) {
            double laborFee = wagePerHour * hour;
            System.out.printf("%d\t\t$%.2f%n", hour, laborFee);
        }

        scanner.close();
    }
}
