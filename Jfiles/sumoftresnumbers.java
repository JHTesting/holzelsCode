//This program will prompt user for 3 nums and display the sum


import java.util.Scanner;
public class sumoftresnumbers {
	public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);

	int sum = 0;
	System.out.println("Enter a digit!"); //Prompt the user for a digit
	int nums1 = Integer.parseInt(reader.nextLine()); //Store users digit
	System.out.println("Enter another digit!"); //Prompt the user for another digit
	int nums2 = Integer.parseInt(reader.nextLine()); //Prompt the user for the second digit
	System.out.println("Enter the last digit!");
	int nums3 = Integer.parseInt(reader.nextLine()); //Prompt the user for the third digit
	int sums3 = nums1 + nums2 + nums3;
	System.out.println("The sum of the digits is " + sums3); //Print the sum of the digits


}


}
