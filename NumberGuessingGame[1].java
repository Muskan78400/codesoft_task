import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random(); // Random number generator
        int n = rand.nextInt(100) + 1; // Generate a random number between 1 and 100
        Scanner scanner = new Scanner(System.in);
        int guess;
        
        System.out.print("Guess a number between 1 and 100: ");
        guess = scanner.nextInt();
        
        // Continue looping until the user guesses the correct number
        while (guess != n) {
            // Check if the guess is within the valid range (1 to 100)
            if (guess >= 1 && guess <= 100) {
                // Provide feedback based on the user's guess compared to the random number
                if (guess < n && n - guess >= 11) {
                    System.out.print("Too low. Guess again: ");
                } else if (guess < n && n - guess <= 10 && n - guess >= 4) {
                    System.out.print("You are low but near. Guess again: ");
                } else if (guess < n && n - guess < 4) {
                    System.out.print("You are very close. Guess again: ");
                } else if (guess > n && guess - n > 10) {
                    System.out.print("Too high. Guess again: ");
                } else if (guess > n && guess - n <= 10 && guess - n >= 4) {
                    System.out.print("You are high but near. Guess again: ");
                } else if (guess > n && guess - n < 4) {
                    System.out.print("You are very close. Guess again: ");
                }
            } else {
                // Prompt the user to enter a valid guess within the specified range
                System.out.print("You guessed out of range. Guess again between 1 to 100: ");
            }
            
            guess = scanner.nextInt(); // Get the next guess from the user
        }
        
        // Output messages after the user guesses the correct number
        System.out.println("You guessed it!");
        System.out.println("The number was: " + n);
        System.out.println("Thanks for playing!");
        
        scanner.close(); // Close the scanner
    }
}