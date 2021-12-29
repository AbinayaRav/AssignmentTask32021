import java.time.Month;
import java.util.Scanner;

public class A3Question8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the year : ");
            int year = scan.nextInt();
            if (year % 4 == 0) {
                System.out.println("The entered year " + year + " is a leap year!!");
            } else {
                System.out.println("The entered year " + year + " is a non-leap year!!");
            }
            System.out.println("Do you wish to continue (Y/N)");
            if (scan.next().equalsIgnoreCase("Y")) {
                continue;
            } else {
                System.exit(0);
            }
        }
    }
}