import javax.swing.*;
import java.time.Month;
import java.util.Scanner;

public class A3Question7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a month code : ");
        Month month = Month.of(scan.nextInt());
        System.out.println("Please enter the year : ");
        int year = scan.nextInt();
        System.out.println("-------------------------------------------------RESULT-------------------------------------------------");
        System.out.println("The month is " + month);
        if (year % 4 == 0) {
            System.out.println("The entered year " + year + " is a leap year!!");
            if (month.name().equalsIgnoreCase("FEBRUARY")) {
                System.out.println("The number of days in " + month + " is " + month.length(true));
            } else {
                System.out.println("The number of days in " + month + " is " + month.length(false));
            }
        } else {
            System.out.println("The entered year " + year + " is a non-leap year!!");
            System.out.println("The number of days in " + month + " is " + month.length(false));
        }


    }

}