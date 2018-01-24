//This program will prompt the user for digits and display the sum at the end

import java.util.Scanner;

public class sumofmanynumers {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter digits to add, enter 0 to stop"); //Prompt user for digits

		int sum = 0;
		while (true) {
			int read = Integer.parseInt(reader.nextLine()); //store digits
			if (read == 0) {
				break; //If user enters 0 then end
			
			
			}
			sum = sum + read; //Add all digits
			System.out.println("Sum now: " + sum);
		
		}
	System.out.println("Sum in the end: " + sum); //Display sum of all digits entered
	
	
	
	
	
	
	
	
	
	}










}
