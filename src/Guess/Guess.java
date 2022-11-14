package Guess;

import java.util.Random;
import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		// into
		System.out.println("========================");
		System.out.println("Title: Guess the Number Game");
		System.out.println("Genre: Java Intermediate");
		System.out.println("Author: Peter Broadbent");
		System.out.println("Language: Java \n" + "Version: " + System.getProperty("java.version"));
		System.out.println("========================\n");
		System.out.println("");
		// Begin code

		// Make new Scanner instance
		Scanner keyboard = new Scanner(System.in);

		// Make new Random instance
		Random random = new Random();

		int guessCount = 0;
		int ourGuess;
		// Limit number between 1-100
		int winningNumber = random.nextInt(100) + 1;
		boolean guessedNumber = false;

		while (!guessedNumber) {
			System.out.println("Enter your Guess: (1 to 100) \n\t");
			ourGuess = keyboard.nextInt();
			guessCount++;

			// If VALID
			if(ourGuess >=1 && ourGuess <=100) {

				if(ourGuess == winningNumber) {
					System.out.println("JACKPOT!");
					System.out.println("In " + guessCount + " guesses.");
					
					guessedNumber = true;
				}
				// Too High
				else if(ourGuess > winningNumber){
					System.out.println("Too High - Go LOWER !");
					
				}
				// Too Low
				else if(ourGuess < winningNumber) {
					System.out.println("Too Low - Go HIGHER !");
					
				}
			}
			else {
				// INVALID Guess
				System.out.println("That was a wasted Guess try again 1 to 100");
				
			}
		} // end while

	}// end main

}
