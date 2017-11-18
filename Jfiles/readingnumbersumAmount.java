//This program will prompt the user for a number and continue until -1 is entered, print sum and amount

import java.util.Scanner;
public class readingnumbersumAmount {
	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);

		System.out.println("Enter a number!: "); //Prompt the user for a number
		int userNum = Integer.parseInt(reader.nextLine()); //Store the users number

		int sum = 0; //initiate sum variable, printed at the end
		int amount = 0; //will act as a counter, print the amount of numbers entered

		while (userNum != -1) {
			System.out.println("Please type a number!: "); //Prompt the user for a number
			sum += userNum; //Add all numbers entered
			amount++; //keep track of numbers entered
			userNum = Integer.parseInt(reader.nextLine()); //Store user number again


		
		}
		System.out.println("Thank you!");
		System.out.println("The sum is " + sum); //Display the sum of numbers entered
		System.out.println("The amound is " + amount); //Display the amount of numbers entered
	
	}

}
