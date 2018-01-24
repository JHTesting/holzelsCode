//This program will log in the user depending on their credentials
//Not finished
import java.util.Scanner;
public class usernameCon {
public static void main(String[] args) {
Scanner reader = new Scanner(System.in);

System.out.println("What is your username?");

String username = reader.nextLine(); //Store the user's username

System.out.println("Please type in your password"); //Prompt for password

String password = reader.nextLine(); //Store user's password

if ((username.equals("alex")) && (password.equals("mightyducks"))) {
	System.out.println("You are now logged in!");
	System.exit(0);



} else if ((username.equals("emily")) && (password.equals("cat"))) {
	System.out.println("You are now logged in!");
	System.exit(0);



} else {
	System.out.println("Invalid username or password");
	System.exit(0);


}



 



}




}
