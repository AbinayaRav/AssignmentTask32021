import java.util.Scanner;

public class A3Question5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number :");
        long num = scan.nextLong();
        long sum = 0;
        long quot;
        long remainder;
        int count = 0;
        while (true) {
            quot = num / 10;
            remainder = num % 10;
            sum = sum + (remainder);
            num = quot;
            count++;
            if (num == 0) {
                break;
            }

        }
        System.out.println("The number of digits in the number is " + count);
        System.out.println("The sum of all the digits is : " + sum);
    }
}