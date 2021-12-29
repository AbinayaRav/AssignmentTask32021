import java.util.Scanner;

public class A3Question9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of rows to be displayed as right triangle :");
        int range = scan.nextInt();
        for (int i = 1; i <= range; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}