// This program will print the least number entered as the parameter

import java.util.Scanner;

public class printleastNumber {

	public static int least(int number1, int number2) {
		Scanner reader = new Scanner(System.in);
		int least = 0; 

		if (number1 == number2) {
			least = Integer.parseInt(reader.nextLine()); //prompt user for number
			//return least;
		
		} else if (number1 > number2) {
			least = number2;
			
		
		} else if (number1 < number2) {
			least = number1;
		
		}
		return least;
		
		
}

public static void main(String[] args) {
    int answer =  least(2, 7);
    System.out.println("Least: " + answer);
}

}
