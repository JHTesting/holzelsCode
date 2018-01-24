// This program will print a right aligned triangle with stars


public class righttriangleMethod {
	private static void printStars(int amount) {

		int counter = 0; //keeps track and stuff

		while (counter < amount) {

			System.out.print("*");
			counter++;
		
		}
	
	}
	private static void printTriangle(int size) {

		int i = 0; //counter

		while (i <= size) {

			whiteSpaces(size - i);

			printStars(i);
			System.out.println(" ");
			i++;
		
		}
	
	}
	private static void whiteSpaces(int space) {

		int tracker = 0; //counter

		while (tracker <= space) {

			System.out.print(" ");
			tracker++;
		
		}
	
	}
	public static void main(String[] args) {
		printTriangle(4); // Print triangle left aligned
	
	}

}
