//program will prompt user for name and display reversed name


import java.util.Scanner;

public class reversedCharacters {
	public static void main(String[] args){
	Scanner reader = new Scanner (System.in);

	System.out.println("Please enter you name: "); //Prompt the user for their name
	String name = reader.nextLine(); //Store user's name in var String

	int leng = (name.length()) - 1; //get the length of the users name
	int counter = 0; //counter

	while (counter < leng){
		char chor = name.charAt(leng); //get the letters in a char var
		System.out.print(chor); //print the letters
		//counter++; //counter
		leng--;
	
	}
	System.out.println("");
       System.exit(0);	

}


}
