import java.util.Scanner;

public class Lab7HarrisonHughey {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter the square feet
        System.out.println("Please enter the square feet");
        int squareFeet = scanner.nextInt();

        double ratePerSquareFeet = 0.0;

        // Determining the rate per square feet based on user input
        if (squareFeet <= 1000) {
            ratePerSquareFeet = 10.99;
        } else if (squareFeet > 1000) {
            ratePerSquareFeet = 15.99;
        }

        // Calculating the painting charge
        double paintingCharge = ratePerSquareFeet * squareFeet;

        // Displaying the painting charge
        System.out.printf("The painting charges is $%20.2f.%n", paintingCharge);
    }
}