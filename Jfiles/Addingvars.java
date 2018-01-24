//This program will prompt the user for two integers then print the sum.


import java.util.Scanner;
public class Addingvars {
public static void main(String[] args) {
	Scanner reader = new Scanner (System.in);

	System.out.println("Please enter a number!"); //Prompt the user for the first number
	int num1 = Integer.parseInt(reader.nextLine()); //Store user's input into a var

	System.out.println("Please enter a second number!"); //Prompt user for a second number
	int num2 = Integer.parseInt(reader.nextLine()); //Store user's second input into var 
	int sum = num1 + num2;
		System.out.println("The sum is " + sum + "!");












}




}
