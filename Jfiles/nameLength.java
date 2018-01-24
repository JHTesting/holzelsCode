// This program will display the length of the user's name

import java.util.Scanner;

public class nameLength {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.println("Type your name: "); //prompt user for their name

		String name = reader.nextLine();
		int length = name.length();

		System.out.println("Your name is this long: " + length);
	
	}

}
