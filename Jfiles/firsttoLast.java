//This program will prompt the user for the first num to the last num

import java.util.Scanner;
public class firsttoLast {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter the first number to count up from");//Prompt user for first num
		int first = Integer.parseInt(reader.nextLine()); //Store user's first value
		System.out.println("Please enter a last digit to count up to");//Prompt user for last num
		int last = Integer.parseInt(reader.nextLine()); //Store user's last value

		while (first <= last) {
			System.out.println(first);
			first++;
		
		
		}
	
	
	}



}
