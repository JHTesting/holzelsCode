//This program will prompt the user for a beginning num and a final num then add the numbers between them

import java.util.Scanner;
public class sumbetweenNums {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the first digit please"); //Prompt the user for the first digit
		int first = Integer.parseInt(reader.nextLine()); //Store users first num

		System.out.println("Enter the second digit please"); //Prompt the user for second digit
		int second = Integer.parseInt(reader.nextLine()); //Store users second num

		int sum = 0; //will keep track of how many times the code is activated

		while (first <= second) {
			sum += first;
			first++;

		
		}
	System.out.println(sum);
	
	}


}
