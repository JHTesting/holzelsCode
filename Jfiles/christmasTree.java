// This program will print a christmast tree using stars


public class christmasTree {

	private static void printStars(int amount) {

		int counter = 0; //keeps track of how many times code is activated

		while (counter < amount) {
			System.out.print("*"); //print stars

			counter++; //counter keeps track
		
		}
	
	}
	private static void printTriangle(int size) {

		int tracker = 1; //keeps track of how many times the code has activated
		int amountStars = 1; //stagger
		int spaces = size - tracker; //stagger



		while (tracker <= size) {
			whiteSpace(spaces);
			printStars(amountStars);
			whiteSpace(spaces);
			System.out.println(" ");
			
			tracker++; //keeps track
			amountStars += 2;
			spaces--;

		
		
		}
		
		int stalkTracker = 0; //tracker
		int amountSpaces = 2;
		int stalk = 1;

		while (stalkTracker <= stalk) {
			whiteSpace(amountSpaces);
			printStars(3);
			whiteSpace(amountSpaces);
			System.out.println(" ");
			stalkTracker++;
		
		}
	
	}
	private static void whiteSpace(int space) {

		int i = 1; //tracker

		while (i <= space) {
			System.out.print(" ");
			i++; //tracker
		
		}
	
	}
	public static void main(String[] args) {
		
		printTriangle(4);
	
	}

}
