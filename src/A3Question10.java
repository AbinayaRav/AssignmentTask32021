
import java.util.Scanner;

public class A3Question10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of rows to be displayed as a Pascal's triangle :");
        int range = scan.nextInt();
        for (int i = 1; i <= range; i++) {
            int k = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k = k * (i - j) / j;
            }
            System.out.println();
        }
    }
}