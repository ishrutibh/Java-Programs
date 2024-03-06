package forLoop;

import java.util.Scanner;

public class fact {

		    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int randomNumber = (int) (Math.random() * 100) + 1; // Generate a random number between 1 and 100
	        int attempts = 0;
	        boolean hasGuessedCorrectly = false;

	        System.out.println("Welcome to the Guessing Game!");
	        System.out.println("I have selected a random number between 1 and 100. Try to guess it.");

	        for (int i = 1; i <= 10; i++) { // Allow 10 attempts
	            System.out.print("Attempt " + i + ": Enter your guess: ");
	            int guess = scanner.nextInt();
	            attempts++;

	            if (guess == randomNumber) {
	                hasGuessedCorrectly = true;
	                break; // Exit the loop if the guess is correct
	            } else if (guess < randomNumber) {
	                System.out.println("Too low. Try again.");
	            } else {
	                System.out.println("Too high. Try again.");
	            }
	        }

	        if (hasGuessedCorrectly) {
	            System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
	        } else {
	            System.out.println("Sorry, you did not guess the number. It was: " + randomNumber);
	        }

	        scanner.close();
	    }
	}
