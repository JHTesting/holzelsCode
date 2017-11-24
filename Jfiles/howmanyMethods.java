//This program will prompt the user for the amount of times to call a method

import java.util.Scanner;
public class howmanyMethods {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("How many times should the text be printed?"); //Ask the user how many times to print text
		int amount = Integer.parseInt(reader.nextLine()); //Store users value
		int tracker = 0; //keeps track of how many times the code is activated

		while (tracker < amount) {
			printText(); //Calls the printText method
			tracker++; //Keeps track of the times activated

		
		}
	
	}
	public static void printText() {
		System.out.println("Greetings and stuff"); //Print this
	
	}

}
