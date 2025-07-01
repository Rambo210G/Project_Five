import java.util.Scanner;

public class Assignment12HarrisonHughey {
    public static void main(String[] args) {
        // 2) Print "How many tests do you have?"
        System.out.print("How many tests do you have? ");

        // 3) Declare a Scanner and obtain an integer from the user.
        Scanner scanner = new Scanner(System.in);
        int numberOfTests = scanner.nextInt();

        // 4) Create an array to hold that number of scores.
        int[] testScores = new int[numberOfTests];

        // 5) Get the individual test scores using a Loop
        int sum = 0; // Initialize sum for calculating average

        for (int i = 0; i < numberOfTests; i++) {
            // Display message to enter a test score
            System.out.print("Enter test score: ");
            
            // Get the individual test scores using the Scanner
            testScores[i] = scanner.nextInt();

            // Calculate the sum of the scores
            sum += testScores[i];
        }

        // 6) Calculate and display the average of the test scores
        double average = (double) sum / numberOfTests;
        System.out.printf("Test Score Average: %.2f%n", average);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
