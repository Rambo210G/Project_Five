package exam3HarrisonHughey;

import java.util.Scanner;

public class exam3HarrisonHughey {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        
        
        // Prompt user for name, tee time, membership status, and number of players
        System.out.println("Please enter your name");
        String name = input.nextLine();

        System.out.println("Please enter your tee time");
        String teeTime = input.nextLine();

        System.out.println("Please enter your membership status: 1 for membership and 0 for non-member");
        int membershipStatus = input.nextInt();

        System.out.println("Please enter the number of players");
        int numPlayers = input.nextInt();

        input.close(); // Close the scanner

        // Display player's name and tee time
        System.out.println("Player: " + name);
        System.out.println("Tee Time: " + teeTime);

        // Display table header
        System.out.println("Players\t\t\tGolf Fee");
        System.out.println("----------------------------------------------");

        // Calculate golf fee based on membership status
        double rate = (membershipStatus == 1) ? 18.45 : 21.34;

        // Calculate and display the golf fee for each player using a for loop
        for (int i = 1; i <= numPlayers; i++) {
            double golfFee = rate * i;
            System.out.printf("%d\t\t\t$%.2f%n", i, golfFee);
        }
    }
}
