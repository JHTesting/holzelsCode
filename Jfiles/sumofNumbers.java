//This program will prompt the user for the last number to add up to

import java.util.Scanner;
public class sumofNumbers {
  public static void main(String[] args) {
    Scanner reader = new Scanner (System.in);

    System.out.println("Please enter the last digit to add up to"); //Prompt user for last number
    int last = Integer.parseInt(reader.nextLine()); //Store user's last value
    int num = 0; //Beginning of adding
    int tracker = 0; //Keep track of how many times the code has activated


    while (tracker <= last) {
      //System.out.println(num);
      num += tracker; //add the times activated to num
      tracker++; //Keep track of how many times the code is activated


    }
System.out.println(num); //Print the sum 

  }



}
