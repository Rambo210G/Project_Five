package array333;

import java.util.Scanner;

public class array333 {

	public static void main(String[] args) {
		
		Scanner MyScanner = new Scanner(System.in);
		
		int numStudents = 0;
		System.out.println("Please enter the number of student in your class");
		numStudents = MyScanner.nextInt();
		
		
		
		
		
		
		
		
		
		String [] names = new String [numStudents];
		
		
		
		
		
		
		
		
		
		
		int numScore = 0;
		System.out.println("How many exams did you have?");
		numScore = MyScanner.nextInt();
		
		
		
		int numStudents = 0;
		System.out.println("Please enter the number of student in your class");
		numStudents = MyScanner.nextInt();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		double [] score = new double [numScore];
		
		double sum =0, average=0;
		
for(int counter1=0;counter1<=numStudents-1;counter1++)
{

	System.out.printf("Please enter your student # %d name", counter1+1);
	names[counter1] = MyScanner.next();
		
		
		
		
		
		
		
		
		
		for (int counter=0;counter<=numScore-1;counter++)
		{
		
		System.out.println("Please enter your exam # %d score\n" + (counter+1) +" score");
		score[counter]= MyScanner.nextDouble();
		
		
		
		
		sum = sum + score[counter];
		
		}
		average = sum /numScore;		
		System.out.printf("The average of the exams is %.2f\n.", average);
		sum=0;
	}
}
}
	
	
	
	
	
	

