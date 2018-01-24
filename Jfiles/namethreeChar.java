//Diese Programm schreibt die ersten 3 Buchstaben

import java.util.Scanner;

public class namethreeChar{

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.println("Bitte schreiben Sie ihre Name: "); //Befragt der Benutzer für eine Name

		String name = reader.nextLine(); //Speichert die Name der Benutzer

		     int length = name.length();
    
                    if (length >= 3) {
            
                    char erste = name.charAt(0);
                    char zweite = name.charAt(1);
                    char dritte = name.charAt(2);
                  
                    System.out.println("1 character: " + erste);
                    System.out.println("2 character: " + zweite);
                    System.out.println("2 character: " + dritte);
                    
                    } else {
                    
                            System.out.println("Not enough letters!");
                            
    
                    } 


	
	}

}
