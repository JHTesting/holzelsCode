//This program will prompt the user to enter a number to count up to

import java.util.Scanner;
public class uptoWhat {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int num = 0; //Create var with 0 value
		System.out.println("What number do you want to count up to?");
		int userNum = Integer.parseInt(reader.nextLine()); //Store user's value

		while (num <= userNum) {
			System.out.println(num);
			num++;
		
		
		}
	
	
	
	}






}
