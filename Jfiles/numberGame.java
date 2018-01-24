// Diese Programm werde eine Zufallszahl auswählen und der Benutzer muss die Nummer raten.

import java.util.Scanner;
import java.util.Random;
public class numberGame {

	private static void outputMore() {
		System.out.println("Your guess was too high!");
	
	}
	private static void outputLess() {
		System.out.println("Your guess was too low!");
	
	}
	private static void outputRight() {
		System.out.println("You are correct!");
	
	}
	public static void main(String[] args) {
		Random rand = new Random();
		int nummer = rand.nextInt(101) + (-1); //produce random number

		Scanner reader = new Scanner(System.in);

		System.out.println("Guess the number!");

		int guess = Integer.parseInt(reader.nextLine());
		int amountGuess = 1; //keep track of guesses

		while (guess != nummer) {

			if (guess < nummer) {
				outputLess(); //tell user the guess is too small
				System.out.println("Number of guesses: " + amountGuess);
				System.out.println("Guess again!");
				guess = Integer.parseInt(reader.nextLine());
			
			} else {
				outputMore(); //tell user the guess is too high
				System.out.println("Number of guesses: " + amountGuess);
				System.out.println("Guess again!");
				guess = Integer.parseInt(reader.nextLine());
			
			}
			amountGuess++; //keep track of guesses

		
		}
		outputRight(); //tell the user they are correct
		System.exit(0);
	
	}



}
