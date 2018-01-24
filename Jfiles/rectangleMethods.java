// This program will print a rectangle with stars


public class rectangleMethods {

	private static void printStars(int amount) {

		int counter = 0; //keeps track of how many times the code is activated

		while (counter < amount) {
			System.out.print("*"); //Prints stars


			counter++; //keeps track of how many times the code is activated

		}
	}
		private static void printRectangle(int width, int height) {

			int i = 0; //tracker

			while (i < height) {
				printStars(width);
				System.out.println(" ");
				i++; //tracker

			}


		}
		public static void main(String[] args) {
			printRectangle(17,3);

		}



}
