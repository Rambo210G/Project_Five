package assignment10HarrisonHughey;

public class assignment10HarrisonHughey {
    public static void main(String[] args) {
        // 2) Declare an integer type array.
        int[] array;

        // 3) Initialize the array with {10,20,30,40,50,60,70}
        array = new int[]{10, 20, 30, 40, 50, 60, 70};

        // 4) Write a loop statement to display values for each element.
        for (int i = 0; i < array.length; i++) {
            // Use only one System.out.println or printf statement to display all the elements' value in the for loop.
            System.out.printf("Element %d is %d.%n", i + 1, array[i]);
        }
    }
}
