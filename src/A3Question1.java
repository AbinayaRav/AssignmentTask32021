import java.util.Scanner;

public class A3Question1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number whose multiplication table to be printed :");
        int num = scan.nextInt();
        System.out.println("Please enter the value till which the table has to be printed : ");
        int range = scan.nextInt();
        int result = 0;
        System.out.println("The multiplication table of " + num + " is :");
        for (int i = 1; i <= range; i++) {
            System.out.println(num + " x " + i + " = " + (i * num));
        }

    }


}
