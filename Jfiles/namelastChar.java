// Diese Programm werde die letze Schrifft schreiben

import java.util.Scanner;

public class namelastChar{

	public static char lastChar(String text) {

		char last = text.charAt(text.length()-1); //Findet die letze Schrifft
		System.out.println("Letze Schrifft ist: " + last);
		return last;
	
	}
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Bitte schreiben Sie ihre Name: "); //Befragt der Benutzer für eine Name

		String name = reader.nextLine(); //Speichert die Name der Benutzer

		lastChar(name);
	
	}


}
