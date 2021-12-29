import java.util.Scanner;

public class A3Question6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first number :");
        int num1 = scan.nextInt();
        System.out.println("Please enter the second number :");
        int num2 = scan.nextInt();
        System.out.println("Please enter the third number :");
        int num3 = scan.nextInt();
        if((num3>num2)&&(num2>num1))
        {
            System.out.println("INCREASING");
        }
        else if((num1>num2)&&(num2>num3))
        {
            System.out.println("DECREASING");
        }
        else
        {
            System.out.println("Neither INCREASING nor DECREASING");
        }

    }
}