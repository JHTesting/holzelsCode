//This program will prompt the user for their age and determine if it is reasonable

import java.util.Scanner;

public class Agechecker {
public static void main(String[] args) {

Scanner reader = new Scanner(System.in);

System.out.println("What is your age?");
int age = Integer.parseInt(reader.nextLine()); //Stores the uer's age into a var

if (age <= 0) {

System.out.println("Thats not really possible.."); //Prints when user inputs age equal to 0 or less




} else {
	if (age >= 10 && age < 100) {
	
	System.out.println("You are reasonable");//Prints if age is between 10-100
	
	
	} else {

System.out.println("You are too old, that isn't reasonable....");//Prints if age is more than 100
	}



}






}






}
