//Diese Programm werde die erste Schrifft von die Name der Benutzer

import java.util.Scanner;

public class namefirstChar{
	public static char firstCharacter(String text) {
		char character = text.charAt(0); //Findet die erste Schrifft
		System.out.println("First character: " + character); //Schreibt die erste Schrifft

		return character;
	
	}
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Bitte schreiben Sie ihre Name"); //Befragt der Benutzer für eine Name
		String name = reader.nextLine(); // Speichert die Name der Benutzer

		firstCharacter(name);

	
	}

}
