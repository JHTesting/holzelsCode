//This program will prompt the user for a number then print the sum of the powers


import java.util.Scanner;
public class sumofPowers {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Please enter a number"); //Prompt the user to enter a number
		int userNum = Integer.parseInt(reader.nextLine()); //Store the user's number

		int power = 0; //power
		int tracker = 0; //keeps track of how many times the code has been activated
		int sum = 0; //display sum at the end

		while (tracker <= userNum) {
			//power = power ** counter;
			power = (int)Math.pow(2, tracker); //calculate 2 ** tracker
			sum += power; //add all the powers
			tracker++;

		
		}
		System.out.println("Sum is " + sum); //Print the sum of the powers

		

	
	}

}
