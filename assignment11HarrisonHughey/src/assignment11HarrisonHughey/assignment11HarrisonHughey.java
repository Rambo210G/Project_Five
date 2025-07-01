package assignment11HarrisonHughey;

public class assignment11HarrisonHughey {
    public static void main(String[] args) {
        // 2) Declare an integer type array.
        int[] values;

        // 3) Initialize the array with {50,75,35,80,27,45,65,87,38}
        values = new int[]{50, 75, 35, 80, 27, 45, 65, 87, 38};

        // 4) Write a loop statement to calculate the sum.
        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            // Calculate the sum of the values
            sum += values[i];
        }

        // 5) Display the sum followed by "Sum is "
        System.out.println("Sum is " + sum);

        // 6) Calculate and display the average followed by "Average is ". Use Array. length.
        double average = (double) sum / values.length;
        System.out.printf("Average is %.2f%n", average);
    }
}
