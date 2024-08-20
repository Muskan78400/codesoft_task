package com.company6;
import java.util.Scanner;


public class StudentGradeCalculator {
	


		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			char choice='y';
	while(choice=='y' || choice=='Y') {
			// Input the number of subjects
			System.out.print("Enter the number of subjects: ");
			int numSubjects = scanner.nextInt();

			int totalMarks = 0;
			for (int i = 1; i <= numSubjects; i++) {
				System.out.print("Enter marks for subject " + i + ": ");
				int marks = scanner.nextInt();
				totalMarks += marks;
			}

			// Calculate average percentage
			double averagePercentage = (double) totalMarks / numSubjects;

			// Determine the grade
			String grade;
			
			grade = averagePercentage >= 90 ? "A"
					: averagePercentage >= 80 ? "B" : averagePercentage >= 70 ? "C" : averagePercentage >= 60 ? "D" : "F";

			// Display results
			System.out.println("Total Marks: " + totalMarks);
			System.out.println("Average Percentage: " + averagePercentage);
			System.out.println("Grade: " + grade);
	System.out.println("enter more(y or n):");		
	choice=scanner.next().charAt(0);
	}
			scanner.close();
		}
	}



