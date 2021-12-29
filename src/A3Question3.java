import java.time.Month;
import java.util.Scanner;

public class A3Question3 {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("Please enter a number between 1 and 12 to obtain the month details: ");
                int monthCode = scan.nextInt();
                Month month = Month.of(monthCode);
                System.out.println("The selected month is : " + month);
                if (month.name().equalsIgnoreCase("FEBRUARY")) {
                    System.out.println(month + " has " + month.length(true) + " days in a leap year and has " + month.length(false)
                            + " days in a non leap year");
                } else
                    System.out.println(month + " has " + month.length(false) + " days ");
            } catch (Exception e) {
                System.out.println("Invalid entry !! please try again!!");
                continue;
            }
            break;
        }
    }
}