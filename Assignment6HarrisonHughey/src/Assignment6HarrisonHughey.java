import java.util.Scanner;

public class Assignment6HarrisonHughey {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Obtain square feet from user
        System.out.println("Please enter the square feet");
        double squareFeet = scanner.nextDouble();
        
        // Determine rate based on square feet
        double rate;
        if (squareFeet <= 1000) {
            rate = 10;
        } else if (squareFeet <= 2000) {
            rate = 15;
        } else if (squareFeet <= 3000) {
            rate = 17;
        } else {
            rate = 20;
        }
        
        // Obtain membership info and determine discount
        System.out.println("Please enter your membership code: 1 for gold, 2 for silver, 3 for bronze, and 4 for standard");
        int membershipCode = scanner.nextInt();
        
        double discount;
        switch (membershipCode) {
            case 1:
                discount = 300;
                break;
            case 2:
                discount = 200;
                break;
            case 3:
                discount = 100;
                break;
            case 4:
            default:
                discount = 0;
                break;
        }
        
        // Calculate and display painting charges
        double paintingCharge = rate * squareFeet - discount;
        System.out.printf("The painting charges is $%,15.2f.%n", paintingCharge);
    }
}
