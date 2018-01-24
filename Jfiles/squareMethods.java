// This program will make a square with stars


public class squareMethods {
	private static void printStars(int amount) {
		
		int counter = 0; //keeps track of how many times the code is activated

		while (counter < amount) {
			System.out.print("*"); //Prints stars
		

			counter++; //keeps track of how many times the code is activated
		
		}
	}
		private static void printSquare(int sideSize) {

			int i = 0; //tracker

			while (i < sideSize) {
				printStars(sideSize);
				System.out.println(" ");
				i++; //tracker
			
			}
		
		
		}
		public static void main(String[] args) {
			printSquare(4);
		
		}
	
	}




