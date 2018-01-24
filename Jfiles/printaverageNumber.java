// this program will print the average of the parameters

public class printaverageNumber {

	public static double average(int number1, int number2, int number3, int number4) {
		double average = 0; //init average var for later use
		average = (number1 + number2 + number3 + number4) / 4; //calculate average
		return average;
    
}

public static void main(String[] args) {
    double answer = average(4, 3, 6, 1);
    System.out.println("average: " + answer);
}

}
