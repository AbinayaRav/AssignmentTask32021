import java.util.Scanner;

public class A3Question4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number :");
        int num = scan.nextInt();
        int sum = 0;
        System.out.println("The n natural numbers are : ");
        for(int i = 1; i<=num;i++)
        {
            System.out.print(i+"\t");
            sum+=i;

        }
        System.out.println();
        System.out.println("The sum of n natural numbers is : "+sum);
    }
}