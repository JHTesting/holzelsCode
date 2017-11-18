//This program will prompt the user a number and repeat until -1 is entered then prints the sum of nums entered

import java.util.Scanner;
public class readingnumberSums {
	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		
		System.out.println("Please type a number!: "); //Prompt the user for a number
		int userNum = Integer.parseInt(reader.nextLine()); //Store the users number
		int sum = 0;

		while (userNum != -1) {
			System.out.println("Type a number!: "); //Prompt the user for another number
			sum += userNum; //Add all numbers entered
			userNum = Integer.parseInt(reader.nextLine()); //Store the number
		
		}
		System.out.println("Thank you!");
	       System.out.println("The sum is: " + sum); //Print the sum
       System.exit(0);	       
	
	}

}
