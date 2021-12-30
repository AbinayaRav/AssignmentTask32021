
import java.util.Scanner;

public class A3Question11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first floating point number :");
        Float num1 = scan.nextFloat();
        System.out.println("Please enter second floating point number :");
        Float num2 = scan.nextFloat();
        String s1 = num1.toString();
        String s2 = num2.toString();

        if ((getStringUptoTwoDecimalPlaces(s1).equalsIgnoreCase(getStringUptoTwoDecimalPlaces(s2)))) {
            System.out.println("The floating point numbers are same 2 decimal place");
        } else {
            System.out.println("The floating point numbers are not equal upto two decimal places");
        }
    }

    public static String getStringUptoTwoDecimalPlaces(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                if (s.substring(i).length() > 2) {
                    s = s.substring(0, i + 3);
                    break;
                }
            }
        }
        return s;
    }

}
