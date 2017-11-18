//This program will prompt the user for a number until -1 is typed


import java.util.Scanner;
public class readingNumbers {
	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);

		System.out.println("Please type a number!:"); //Prompts the user for a number
		int userNum = Integer.parseInt(reader.nextLine()); //Store the user's number


		while (userNum != -1) {
			System.out.println("Type a number!"); //Prompt user for another number
			
		        userNum = Integer.parseInt(reader.nextLine()); //Store the users new number
			
		
		}
		System.out.println("Thank you!"); //Displayed after the user has entered -1
		System.exit(0);
	
	}

}
