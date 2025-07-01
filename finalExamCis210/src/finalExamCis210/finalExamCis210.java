package finalExamCis210;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class finalExamCis210 {
    public static void main(String[] args) {
        // Step 2: Ask the number of workdays
        String daysWorkedInput = JOptionPane.showInputDialog("How many days have you worked for this week?");
        int daysWorked = Integer.parseInt(daysWorkedInput);

        // Step 3: Calculate daily cost using Switch statement
        int dailyCost;
        switch (daysWorked) {
            case 1:
                dailyCost = 300;
                break;
            case 2:
                dailyCost = 500;
                break;
            case 3:
                dailyCost = 600;
                break;
            case 4:
                dailyCost = 650;
                break;
            case 5:
                dailyCost = 700;
                break;
            default:
                dailyCost = 0; // Handle invalid input
        }

        // Step 4: Create an array to hold the number of transactions per day
        int[] transactions = new int[daysWorked];

        // Step 5: Declare a Scanner
        Scanner scanner = new Scanner(System.in);

        // Step 6: Get the individual number of transactions using a Loop
        int totalTransactions = 0;
        for (int i = 0; i < daysWorked; i++) {
            System.out.print("Enter the number of transactions for day " + (i + 1) + ": ");
            transactions[i] = scanner.nextInt();
            totalTransactions += transactions[i];
        }

        // Step 7: Calculate weekly income
        int weeklyIncome = totalTransactions * 50;

        // Step 8: Find a bonus based on the number of transactions
        int bonus;
        if (totalTransactions > 50) {
            bonus = 1000;
        } else if (totalTransactions >= 30 && totalTransactions <= 49) {
            bonus = 800;
        } else if (totalTransactions >= 10 && totalTransactions <= 29) {
            bonus = 500;
        } else {
            bonus = 0; // No bonus for fewer than 10 transactions
        }

        // Step 9: Calculate and display a weekly revenue
        int weeklyCost = dailyCost * daysWorked;
        int weeklyRevenue = weeklyIncome + bonus - weeklyCost;

        // Display the weekly revenue through a Message Dialog box
        JOptionPane.showMessageDialog(null, "Weekly Revenue: $" + weeklyRevenue);
        
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
