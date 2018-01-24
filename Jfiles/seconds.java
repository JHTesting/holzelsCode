public class seconds {
  public static void main(String[] args) {
    int secondsInOneHour = 3600;
    int hours = 24;
    int days = 365;
    int months =12;

    int secondsInAYear = secondsInOneHour * hours * days;
    System.out.println("There are " + secondsInAYear + " seconds in one year.");
  }
}
