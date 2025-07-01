package textboxCis210;

import javax.swing.JOptionPane;

public class textboxCis210 {

    public static void main(String[] args) {
        int totalNumbers = 6;
        double sum = 0;

        for (int i = 1; i <= totalNumbers; i++) {
            String userInput = JOptionPane.showInputDialog("Enter number " + i);
            double number = Double.parseDouble(userInput);
            sum += number;
        }

        JOptionPane.showMessageDialog(null, "Sum of the numbers is " + sum + ".");
    }
}





//Final Exam similar to Exam 3
//Final includes 2 parts, first is an application program like ex.3
//1st part on Thurs., and next Tues.
//The 2nd part of the final will have multiple choices similar to quizzes. 