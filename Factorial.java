
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int fact = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = sc.nextInt();
        while (number != 0) {
            fact = fact * number;
            number--;
        }
        System.out.println("Factorial of " + "number " + "is: " + fact);
        sc.close();
    }

}
