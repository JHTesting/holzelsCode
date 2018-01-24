//this program will prompt the user for their name and display the characters seperately

import java.util.Scanner;

public class seperatingCharacters{
	public static void main(String[] args){
		Scanner reader = new Scanner (System.in);

		System.out.println("Please enter your name:"); //prompt the user for their name
		String name = reader.nextLine(); //Store the user's name in var

		int leng = name.length(); //Store name length in var
		int counter = 0; //counter

		while (counter < leng){
			char chara = name.charAt(counter);
			System.out.println(chara); //print the letters
			counter++;

		
		}
		System.exit(0);

	
	}

}
