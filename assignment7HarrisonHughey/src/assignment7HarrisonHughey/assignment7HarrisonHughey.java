package assignment7HarrisonHughey;

import java.util.Scanner;

public class assignment7HarrisonHughey {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Obtain a positive nonzero integer from the user
        System.out.println("Please enter a positive nonzero integer.");
        int num = scanner.nextInt();
        
        // Validate the input
        while (num <= 0) {
            System.out.println("Please enter a positive nonzero integer.");
            num = scanner.nextInt();
        }
        
        // Calculate the sum of all even integers up to the entered number
        int sum = 0;
        for (int i = 2; i <= num; i += 2) {
            sum += i;
        }
        
        // Display the result
        System.out.println("The sum of all the even numbers between 1 and " + num + " is " + sum + ".");
    }
}
