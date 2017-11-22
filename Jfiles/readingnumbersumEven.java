//This program will prompt the user for a number until -1 is entered, will print the sum, average, and amount
// of even or odd numbers entered before -1

import java.util.Scanner;
public class readingnumbersumEven {
	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);

		System.out.println("Please enter a number! "); //Prompt the user for a number
		int userNum = Integer.parseInt(reader.nextLine()); //Store the user number

		int sum = 0; //will hold the sum of all numbers entered, printed at end
		int amount = 0; //will hold the amount of numbers entered, will print at end
		int evenAmount = 0; //will hold the amount of even numbers
		int oddAmount = 0; //will hold the odd amount of numbers
		

		while (userNum != -1) {
			System.out.println("Type a number! "); //Prompt the user to type another number
			sum += userNum; //Calculates the sum of numbers entered
				amount++; //Keeps track of how many numbers are entered

				if (userNum % 2 == 0 ) {
					evenAmount++;
				
				}

				else {
					oddAmount++;
				
				}
				
			userNum = Integer.parseInt(reader.nextLine()); //Store the users number

		
		
		}
		double average = (double)sum / amount; //calculates the average
		System.out.println("Thank you!");
		System.out.println("The sum is " + sum); //Priints the sum of all numbers entered
		System.out.println("The amount is " + amount); //Prints the amount of numbers entered
		System.out.println("The average is " + average); //Prints the average of numbers entered
		System.out.println("The even amount is " + evenAmount); //Prints the even amount of nums
		System.out.println("The odd amount is " + oddAmount); //Prints the odd amount of nums
	
	}

}

