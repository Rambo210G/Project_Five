package lab10HarrisonHughey;

public class lab10HarrisonHughey {
    public static void main(String[] args) {
        // 2) Declare an integer type array.
        int[] testScores;

        // 3) Initialize the array with {100, 98, 89, 88, 95, 96}
        testScores = new int[]{100, 98, 89, 88, 95, 96};

        // 4) Write a loop statement to display values for each element.
        for (int i = 0; i < testScores.length; i++) {
            // Use only one System.out.println or printf statement to display all the elements' value in the for loop.
            System.out.printf("Student %d: %d%n", i + 1, testScores[i]);
        }
    }
}
