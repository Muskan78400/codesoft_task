package com.company6;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class QuizApplication {
	
	       private static final int TIME_LIMIT = 10; // Time limit for each question in seconds
		    private static int score = 0;

		    public static void main(String[] args) {
		        String[][] questions = {
		            {"What is the capital of France?", "Rome", "Madrid", "Paris", "Berlin", "3"},
		            {"Which planet is known as the Red Planet?", "Venus", "Mars", "Jupiter", "Saturn", "2"},
		            {"Who wrote 'To Kill a Mockingbird'?", "Harper Lee", "Mark Twain", "J.K. Rowling", "Jane Austen", "1"},
		            {"What is the largest ocean on Earth?", "Atlantic Ocean", "Indian Ocean", "Pacific Ocean", "Arctic Ocean", "3"}
		        };

		        Scanner scanner = new Scanner(System.in);

		        for (int i = 0; i < questions.length; i++) {
		            String[] question = questions[i];
		            System.out.println("Question " + (i + 1) + ": " + question[0]);
		            System.out.println("1) " + question[1]);
		            System.out.println("2) " + question[2]);
		            System.out.println("3) " + question[3]);
		            System.out.println("4) " + question[4]);

		            Timer timer = new Timer();
		            TimerTask task = new TimerTask() {
		                @Override
		                public void run() {
		                    System.out.println("\nTime's up for this question!");
		                    scanner.nextLine(); // Consume input to prevent blocking
		                }
		            };

		            timer.schedule(task, TIME_LIMIT * 1000);
		            
		            System.out.print("Enter your answer (1-4): (you have 10 seconds)");
		            String userInput = scanner.nextLine();
		            timer.cancel(); // Stop the timer when answer is submitted

		            if (userInput.equals(question[5])) {
		                System.out.println("Correct!");
		                score += 10; // Increase score by 10 for a correct answer
		            } else {
		                System.out.println("Incorrect! The correct answer was option " + question[5]);
		            }
		            System.out.println();
		        }

		        System.out.println("Quiz completed! Your final score is: " + score);
		        scanner.close();
		    }
		}
		


