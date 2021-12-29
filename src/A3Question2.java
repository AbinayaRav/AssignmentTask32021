import java.util.Scanner;

public class A3Question2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 10 numbers whose average needs to be found :");
        double sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + scan.nextDouble();
        }
        System.out.println("Average of the 10 numbers is : "+sum+"/10 = "+ + (double)(sum / 10));
    }
}
