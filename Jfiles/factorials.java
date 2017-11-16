//This program will calculate the factorial of the number a user enters

import java.util.Scanner;
public class factorials {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Please type a number"); //Prompt the user for a number

		int num = Integer.parseInt(reader.nextLine()); //Store users value to calculate factorial
		int factorial = 1; //displays factorial
		int counter = 1; //Keeps track of the number of times the code has activated

		while (counter <= num) {
			factorial *= counter;
			counter++;
		
		}
		System.out.println("Factorial is " + factorial);

	

	
	}


}
