//This program will be a choose your own adventure game 


import java.util.Scanner;

public class Adventuregame {
public static void main(String[] args) {

Scanner reader = new Scanner(System.in);

System.out.println("You wake up in your house, you're on the ground. You start to get up when you notice that there aren't any noises anywhere in the house...");
System.out.println("You have a look around and see no traces of anyone else, but you notice a small amount of mist leaking into the room from an open window..");
System.out.println("Do you 1: Close the window to stop the mist?");
System.out.println("Do you 2: Leave the window and let the mist in, its just mist afterall..");
int openOrClose = Integer.parseInt(reader.nextLine()); //Reads the user's first input

if (openOrClose == 2) {
	System.out.println("You decided to leave the window open, smart move!");
	System.out.println("Within a few seconds the whole house is filled with white mist..");
	System.out.println("You begin to hear things scurring around the floor....");
	System.out.println("You begin to feel critters crawling up your pant legs, multiple stings..");
	System.out.println("Do you 1: Attempt to kill all the critters?");
	System.out.println("Do you 2: Shut the window now?");
	int openned = Integer.parseInt(reader.nextLine()); //Reads the users input again
	if (openned == 1) {
	System.out.println("You attempt to squish every creepy crawly...");
	System.out.println("You get overwhelmed with bugs crawling all over your body...");
	System.out.println("The last thing you see is bugs digging into your eyes..");
	System.out.println("You have died, thanks for playing though..");
	System.exit(0);
	} else if (openned == 2) {
		System.out.println("You decide to try and shut the window!");
		System.out.println("You manage to make your way to the window and close it");
		System.out.println("The mist has already gotten too thick...");
		System.out.println("You begin to hear thousands of little bugs moving towards you");
		System.out.println("You're overwhelmed by bugs and eaten alive....");
		System.out.println("You have died, thank you for playing..");
		System.exit(0);
	
	
	}



} else if (openOrClose == 1) {
	System.out.println("You decided to close the window!");
	System.out.println("The mist thins out and disappears slowly..");
	System.out.println("With a quick look out the window you determine that the mist encompassed your whole neighborhood, maybe even town?");
	System.out.println("Do you 1: Go outside and investigate?");
	System.out.println("Do you 2: Stay inside and call the police?");
	int polizia = Integer.parseInt(reader.nextLine()); //Reads user input AGAIN
	if (polizia == 1) {
		System.out.println("You decided to go outside and investigate..");
		System.out.println("The mist is really thick and makes it impossible to see...");
		System.out.println("You begin to see big spiders with human heads scuttling towards you");
		System.out.println("You try to run back into the house but are ensnarred by webs");
		System.out.println("The spiders release their children on you and they lay eggs inside your body......");
		System.out.println("You have died...Thanks for playing!");
		System.exit(0);
	
	
	
	} else if (polizia == 2) {
		System.out.println("You decided to call the police");
		System.out.println("An officer responds and tells you to remain in your home");
		System.out.println("The officer tells you that the military will arrive in 2 days");
		System.out.println("2 days pass and the military arrives and gets rid of the mist..");
		System.out.println("Strange how they knew exactly what to do......");
		System.out.println("You remain suspicious for the rest of your life");
		System.out.println("You survived! Thanks for playing!");
		System.exit(0);
	
	
	}


}






}



}
