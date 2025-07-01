package lab11HarrisonHughey;

import java.util.Scanner;

public class lab11HarrisonHughey {
    public static void main(String[] args) {
        // 2) Print "How many stocks do you want to buy?"
        System.out.print("How many stocks do you want to buy? ");

        // 3) Declare a Scanner and obtain an integer from the user.
        Scanner scanner = new Scanner(System.in);
        int numberOfStocks = scanner.nextInt();

        // 4) Create an array (double type) to hold the prices of the items.
        double[] stockPrices = new double[numberOfStocks];

        // 5) Get the individual prices using a Loop
        double sum = 0; // Initialize sum for calculating average

        for (int i = 0; i < numberOfStocks; i++) {
            // Display message to enter a stock price
            System.out.print("Enter a stock price: ");
            
            // Get the individual stock prices using the Scanner
            stockPrices[i] = scanner.nextDouble();

            // Calculate the sum of the prices
            sum += stockPrices[i];
        }

        // 6) Calculate and display the average of the prices
        double average = sum / numberOfStocks;
        System.out.printf("Stock Average: %.2f%n", average);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
