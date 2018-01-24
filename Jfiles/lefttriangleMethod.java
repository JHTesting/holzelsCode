// This program will print a triangle aligned to the left with stars


public class lefttriangleMethod {
	
	private static void printStars(int amount) {

		int counter = 0;// Keep track of how many times the code is activated

		while (counter < amount) {
			System.out.print("*"); //print stars

			counter++; //keep track of how many times the code is activated
		
		}
	
	}
	private static void printTriangle(int size) {

		int tracker = 0; //keeps track of how many times the code has been executed

		while (tracker <= size) {
			
			printStars(tracker);
			System.out.println(" ");
			tracker++; //keeps track of how many times the code has been activated
		
		}
	
	}
	public static void main(String[] args) {
		printTriangle(4); //print a triangle with stars
	
	
	}

}
